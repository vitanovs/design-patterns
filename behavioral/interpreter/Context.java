package behavioral.interpreter;

public class Context {

    private double fromUnitQuantity;
    private String fromUnitName;
    private String toUnitName;

    private String requestUnit;
    private String responseUnit;

    public Context(String userInput) {
        this.initializeVariables(userInput);
    }


    private String getUnitName(String unitName) {
        if (unitName.endsWith("s")) {
            unitName = unitName.substring(0, unitName.lastIndexOf("s"));
        }
        char firstLetter = Character.toUpperCase(unitName.charAt(0));
        unitName = firstLetter + unitName.substring(1);
        return unitName;
    }

    private void initializeVariables(String userInput) {
        String[] tokens = userInput.split("\\s+");
        this.requestUnit = tokens[1];
        this.responseUnit = tokens[3];
        this.fromUnitQuantity = Double.parseDouble(tokens[0]);
        this.fromUnitName = this.getUnitName(tokens[1]);
        this.toUnitName = this.getUnitName(tokens[3]);
    }

    public double getFromUnitQuantity() {
        return fromUnitQuantity;
    }

    public String getFromUnitName() {
        return fromUnitName;
    }

    public String getToUnitName() {
        return toUnitName;
    }

    public String getRequestUnit() {
        return requestUnit;
    }

    public String getResponseUnit() {
        return responseUnit;
    }
}
