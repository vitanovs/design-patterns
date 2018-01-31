package creational.prototype;

import creational.prototype.entities.Person;

public class PrototypeDesignPattern {
    public static void main(String[] args) {

        Person tom = Factory.getPrototype("tom");
        Person jack = Factory.getPrototype("jack");

        if(tom != null){
            System.out.println(tom.greet());
        }

        if(jack != null){
            System.out.println(jack.greet());
        }
    }
}
