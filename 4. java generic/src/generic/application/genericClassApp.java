package generic.application;

public class genericClassApp {
    public static void main(String[] args) {
        generic.genericClass<String> stringData = new generic.genericClass<String>("Kinmin");
        generic.genericClass<Integer> integerData = new generic.genericClass<Integer>(1);

        String stringValue = stringData.getData();
        Integer integerValue = integerData.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);
    }
}
