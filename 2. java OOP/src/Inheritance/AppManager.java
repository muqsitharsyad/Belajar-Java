package Inheritance;

public class AppManager {
    public static void main(String[] args) {
        var manager = new Manager("Kin");
        manager.sayHello("Min");

        var vp = new VicePresident("Min");
        vp.sayHello("kin");

        System.out.println(vp.getAge());
        System.out.println(vp.getParentAge());
    }
}
