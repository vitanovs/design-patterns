package behavioral.chainOfResponsibility.entities;

public interface ChainItem {

    void setNextIdem(ChainItem item);

    void execute(Task task);

}
