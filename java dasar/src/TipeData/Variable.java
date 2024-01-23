package TipeData;

public class Variable {
    public static void main(String[] args) {
        String name;
        name = "Kinmin";

        System.out.println(name);

        int age = 30;
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        name = "minori";
        System.out.println(name);

        //penggunaan var harus langsung di inputkan valuenya
        //var firstname; //error
        var firstname = "kin";
        var lastname = "min";

        //penggunaan const/final tidak bisa diubah kembali valuenya
        final var application = "Java";
        //application = "Php" //error
    }
}
