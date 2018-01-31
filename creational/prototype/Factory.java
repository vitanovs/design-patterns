package creational.prototype;

import creational.prototype.entities.Person;
import creational.prototype.entities.Peter;
import creational.prototype.entities.Steve;
import creational.prototype.entities.Tom;

import java.util.HashMap;
import java.util.Map;

public class Factory {

    private static Map<String, Person> prototypes = new HashMap<>();

    static {
        prototypes.put("tom", new Tom());
        prototypes.put("steve", new Steve());
        prototypes.put("peter", new Peter());
    }

    public static Person getPrototype(String type){
        if(prototypes.containsKey(type)){
            return prototypes.get(type);
        } else {
            System.out.println("No prototype named: " + type);
            return null;
        }
    }
}
