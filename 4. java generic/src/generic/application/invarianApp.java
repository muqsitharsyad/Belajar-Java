package generic.application;

import generic.genericClass;

public class invarianApp {
    public static void main(String[] args) {
        genericClass<String> stringData = new genericClass<>("Kinmin");
//        doIt(stringData); error
//        genericClass<Object> objectData = new stringData; error

        genericClass<Object> objectData = new genericClass<>(100);
//        doItInteger(objectData); error
//        genericClass<Integer> integerData = objectData; error
    }

    public static void doIt(genericClass<Object> objectgenericClass){
        //do nothing
    }

    public static void doItInteger(genericClass<Integer> integergenericClass){
        //do nothing
    }
}
