package behavioral.chainOfResponsibility;

import behavioral.chainOfResponsibility.entities.*;
import behavioral.chainOfResponsibility.enums.Operation;

public class ChainOfResponsibilityDesignPattern {
    public static void main(String[] args){
        ChainItem sum = new Summation();
        ChainItem subtract = new Subtraction();
        ChainItem divide = new Division();
        ChainItem multiply = new Multiplication();

        sum.setNextIdem(subtract);
        subtract.setNextIdem(divide);
        divide.setNextIdem(multiply);

        Task task1 = new Task(7, 6, Operation.SUM);
        Task task2 = new Task(8, 5, Operation.SUBTRACT);
        Task task3 = new Task(58, 4, Operation.DIVIDE);
        Task task4 = new Task(9, 7, Operation.MULTIPLY);

        sum.execute(task1);
        sum.execute(task2);
        sum.execute(task3);
        sum.execute(task4);

    }
}
