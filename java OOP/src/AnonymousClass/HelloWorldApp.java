package AnonymousClass;

public class HelloWorldApp {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld() {
            public void sayHello() {
                System.out.println("Hello");
            }

            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };
        helloWorld.sayHello();
        helloWorld.sayHello("Kinmin");
    }
}
