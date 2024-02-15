package generic.application;

import generic.genericClass;

public class covariantApp {
    public static void main(String[] args) {
        genericClass<String> stringData = new genericClass<String>("Kinmin");
        process(stringData);

        genericClass<? extends Object> data = stringData;
    }

    public static void process(genericClass<? extends Object> data){
        System.out.println(data.getData());
//        data.setData(1); tidak boleh, karena berbahaya
    }
}
