package structural.facade.entities;

import java.util.*;

public class Bank {

    private Map<Person, List<BankAccount>> bank;

    public Bank() {
        this.bank = new HashMap<>();
    }

    public String registerAccount(Person person, double deposit) {
        if (!bank.containsKey(person)) {
            bank.put(person, new ArrayList<>());
        }
        BankAccount bankAccount = new BankAccount(person, UUID.randomUUID().toString(), deposit);
        bank.get(person).add(bankAccount);
        return bankAccount.getSecurityCode();
    }

    public double withdraw(Person person, double amount, String code) {
        if (amount <= 0) {
            return 0;
        }
        double result = 0;
        List<BankAccount> accounts = bank.get(person);
        for (BankAccount account : accounts) {
            if (account.getSecurityCode().equals(code)) {
                if (account.getBalance() >= amount) {
                    account.setBalance(account.getBalance() - amount);
                    result = amount;
                } else {
                    break;
                }
            }
        }
        return result;
    }

}
