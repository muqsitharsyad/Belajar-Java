package Method;

public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Kin");
        sayHello("kin", "Min");
    }
    //nama method boleh sama, tapi parameter harus beda
    static void sayHello(){
        System.out.println("Hello");
    }

    static void  sayHello(String name){
        System.out.println("Hello " + name);
    }

    static void sayHello(String first, String last){
        System.out.println("Hello " + first + " " + last);
    }
}
