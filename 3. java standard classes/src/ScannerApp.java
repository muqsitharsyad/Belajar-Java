import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        //input data dari console
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama : ");
        String name = scanner.nextLine();

        System.out.print("Umur : ");
        Integer umur = scanner.nextInt();

        System.out.println("Hello " + name + " Umur anda " + umur);
    }
}
