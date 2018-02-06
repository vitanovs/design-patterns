package structural.facade;

import structural.facade.entities.Bank;
import structural.facade.entities.Person;

public class FacadeDesignPattern {
    public static void main(String[] args) {
        Person person = new Person("Stoyan",
                        "Vitanov",
                        21,
                        "vitanov@email.com");
        Bank bank = new Bank();

        BankFacade facade = new BankFacade(person, bank);


        facade.deposit(1000);
        facade.withdraw(50);
        facade.withdraw(900);
        facade.withdraw(60);
        System.out.println();

    }
}
