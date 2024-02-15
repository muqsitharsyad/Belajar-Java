package generic.application;

import generic.genericClass;

public class wildCardApp {
    public static void main(String[] args) {
        print(new genericClass<Integer>(100));
        print(new genericClass<String>("Kinmin"));
        print(new genericClass<multipleConstraint.Manager>(new multipleConstraint.Manager()));
    }

    public static void print(genericClass<?> genericClass){
        System.out.println(genericClass.getData());
    }
}
