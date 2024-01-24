package IfElse;

public class ifStatement {
    public static void main(String[] args) {
        var nilai = 70;
        var absen = 90;

        if (nilai >= 75 && absen >= 75){
            System.out.println("Selamat anda lulus");
        } else {
            System.out.println("Anda tidak lulus");
        }

        if (nilai >= 80) {
            System.out.println("Nilai A");
        } else if (nilai >= 70) {
            System.out.println("Nilai B");
        } else if (nilai >= 60) {
            System.out.println("Nilai C");
        } else {
            System.out.println("Nilai D");
        }
    }
}
