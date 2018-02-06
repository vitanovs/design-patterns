package structural.facade;

import structural.facade.entities.Bank;
import structural.facade.entities.Person;

import java.util.ArrayList;
import java.util.List;

public class BankFacade {

    private Person person;
    private Bank bank;
    private List<String> accountCodes;

    public BankFacade(Person person, Bank bank) {
        this.person = person;
        this.bank = bank;
        this.accountCodes = new ArrayList<>();
    }

    public boolean deposit(double amount) {
        String code = this.bank.registerAccount(this.person, amount);
        this.accountCodes.add(code);
        return code != null;
    }

    public double withdraw(double amount) {
        double result = 0;
        for (String accountCode : accountCodes) {
            result = this.bank.withdraw(this.person, amount, accountCode);
            if (result > 0) {
                break;
            }
        }
        return result;
    }

}
