package behavioral.chainOfResponsibility.entities;

import behavioral.chainOfResponsibility.enums.Operation;

public class Multiplication implements ChainItem{

    private ChainItem nextItem;

    public Multiplication(){

    }

    @Override
    public void setNextIdem(ChainItem item) {
        this.nextItem = item;
    }

    @Override
    public void execute(Task task) {
        if(task.getOperation().equals(Operation.MULTIPLY)){
            System.out.printf("%d * %d = %d\n",
                    task.getNum1(),
                    task.getNum2(),
                    task.getNum1() * task.getNum2());
        } else {
            throw new UnsupportedOperationException("Allowed operations: summation, subtraction, division and multiplication.");
        }
    }
}
