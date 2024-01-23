package Inheritance;

class VicePresident extends Manager{
    //Method overriding menimpa method yg sudah ada maka tidak akan bisa di akses lagi
    VicePresident(String name){
        super(name);
    }
    void sayHello(String name){
        System.out.println("Hi " + name + ", My name is VP " + this.name);
    }

    int getAge(){
        return 30;
    }

    int getParentAge(){
        return super.getAge();
    }
}
