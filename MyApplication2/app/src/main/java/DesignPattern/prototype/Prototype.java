package DesignPattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class Prototype {
    private static final Map<String, Person> prototypes = new HashMap<>();

    static {
        prototypes.put("tom", new Tom());
        prototypes.put("dick", new Dick());
    }

    public Person getPrototype(String name){
        Person proto=null;
       proto = prototypes.get(name).clone();
        return proto;

    }
}
