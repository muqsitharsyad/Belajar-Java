package generic.application;

public class multipleConstraint {
    public static void main(String[] args) {
//        Data<Manager> managerData = new Data<>(new Manager()); Error manager tidak implement CanSayHello
        Data<VicePresident> vicePresidentData = new Data<>(new VicePresident());
    }

    public static interface CanSayHello{
        void sayHello(String name);
    }
    public static abstract class Employee{

    }

    public static class Manager extends Employee{

    }

    public static class VicePresident extends Employee implements CanSayHello{
        @java.lang.Override
        public void sayHello(java.lang.String name) {
            System.out.println("Hello " + name);
        }
    }

    public static class Data<T extends Employee & CanSayHello>{
        private T Data;

        public Data(T data) {
            Data = data;
        }

        public T getData() {
            return Data;
        }

        public void setData(T data) {
            Data = data;
        }
    }
}
