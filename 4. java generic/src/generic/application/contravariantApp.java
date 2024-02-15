package generic.application;

import generic.genericClass;

public class contravariantApp {
    public static void main(String[] args) {
        genericClass<Object> objectData = new genericClass<>("Kin");
        objectData.setData(100);

        genericClass<? super String> data = objectData;

        process(objectData);

        System.out.println(objectData.getData());

    }

    public static void process(genericClass<? super String> data){
        Object value = data.getData();
        System.out.println("Process parameter " + value);

        data.setData("Min");

    }
}
