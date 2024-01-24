package Inheritance;

class Manager extends Employee{
//    String name;
    Manager(String name){
        super(name);
    }

    void sayHello(String name){
        System.out.println("Hi " + name + ", My name is Manager " + this.name);
    }

    int getAge(){
        return 25;
    }
}
