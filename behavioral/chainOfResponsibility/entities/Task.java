package behavioral.chainOfResponsibility.entities;

import behavioral.chainOfResponsibility.enums.Operation;

public class Task {

    private int num1;
    private int num2;
    private Operation operation;

    public Task(int num1, int num2, Operation operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
}
