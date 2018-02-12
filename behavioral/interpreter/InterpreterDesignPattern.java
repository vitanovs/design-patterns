package behavioral.interpreter;


public class InterpreterDesignPattern {
    public static void main(String[] args) {

        String input = "2 meters to decimeters";
        Context context = new Context(input);

        Interpreter interpreter = new MetricInterpreter();

        String interpreted = interpreter.interpred(context);

        System.out.println(interpreted);


    }
}
