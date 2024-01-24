package Static;

import Static.Utils.Method;

public class StaticApp {
    public static void main(String[] args) {
        //field
        System.out.println(Field.APPLICATION);
        System.out.println(Field.VERSION);

        //method
        System.out.println(Method.sum(1,2,3,4,5));

        //Inner class
        InnerClass.city city = new InnerClass.city();
        city.setName("Tangerang");
        System.out.println(city.getName());

        //Block
        System.out.println(Block.PROCESSOR);
    }
}
