package Equals;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Kin";
        first = first + "Min";
        System.out.println(first);

        String second = "KinMin";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        //jika isi data nya sama, maka akan merefer ke variable sebelmunya
        String third = "KinMin";

        System.out.println(second == third);
        System.out.println(second.equals(third));
    }
}
