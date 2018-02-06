package structural.facade.entities;

public class BankAccount {

    private Person owner;
    private String securityCode;
    private double balance;

    public BankAccount(Person owner, String securityCode, double balance) {
        this.owner = owner;
        this.securityCode = securityCode;
        this.balance = balance;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
