package Inheritance;

public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Kin");
        employee.sayHello("Min");

        employee = new Manager("Kin");
        employee.sayHello("Min");

        employee = new VicePresident("Kin");
        employee.sayHello("Min");

        sayHello(new Employee("Kin"));
        sayHello(new Manager("Min"));
        sayHello(new VicePresident("Kin"));
    }

    static void sayHello(Employee employee){
        if (employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        }else {
            System.out.println("Hello Employee " + employee.name);
        }
    }
}
