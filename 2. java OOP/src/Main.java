public class Main {
    public static void main(String[] args) {
        //Membuat Object
        var person1 = new Person("Kin", "Tangsel");
        // person1.name = "Kin";
        // person1.address = "Tangsel";

        System.out.println(person1.name + person1.address + person1.country);

        person1.sayHello("Budi");

        Person person2 = new Person("Min");
        person2.sayHello("Mael");

        Person person3;
        person3 = new Person();
        person3.name = "Ayub";
        person3.sayHello("Sueb");

        //Setter & Getter
        var getset = new GetterSetter();
        getset.setId("ID");
        getset.setId(null);
        System.out.println(getset.getId());
    }
}