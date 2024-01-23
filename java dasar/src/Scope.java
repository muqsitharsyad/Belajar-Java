public class Scope {
    public static void main(String[] args) {
        sayHello("Kin");
    }
    static void sayHello(String name){
        //scope => akses variabel hanya bisa di dalm block nya
        String hello = "Hello " + name;
        if(!name.isBlank()){
            String hi = "Hi " + name;
            System.out.println(hi);
        }

        //System.out.println(hi);
        System.out.println(hello);
    }
}
