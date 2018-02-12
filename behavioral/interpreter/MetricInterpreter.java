package behavioral.interpreter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MetricInterpreter implements Interpreter {

    private static final String UNITS_PACKAGE = "behavioral.interpreter.units.";

    @Override
    public String interpred(Context context) {
        String fromUnitName = context.getFromUnitName();
        double fromUnitQuantity = context.getFromUnitQuantity();
        String toUnitName = context.getToUnitName();

        try {
            double toUnitQuantity = 0.0;

            Class<?> uClass = Class.forName(UNITS_PACKAGE + fromUnitName);
            Object unitInstance = uClass.newInstance();


            Method[] declaredMethods = uClass.getDeclaredMethods();
            for (Method declaredMethod : declaredMethods) {
                if (declaredMethod.getName().contains(toUnitName)) {
                    toUnitQuantity = (double) declaredMethod.invoke(unitInstance, fromUnitQuantity);
                    break;
                }
            }

            if (toUnitQuantity == 0.0) {
                return toUnitName + " is not supported.";
            }

            StringBuilder builder = new StringBuilder();
            builder.append(fromUnitQuantity).append(" ")
                    .append(context.getRequestUnit()).append(" ")
                    .append("equals").append(" ")
                    .append(toUnitQuantity).append(" ")
                    .append(context.getResponseUnit());

            return builder.toString();

        } catch (ClassNotFoundException |
                IllegalAccessException |
                InstantiationException |
                InvocationTargetException e) {
            e.printStackTrace();
            System.err.println("Error occurs during converting " + fromUnitName + " to " + toUnitName);
            return null;
        }
    }
}
