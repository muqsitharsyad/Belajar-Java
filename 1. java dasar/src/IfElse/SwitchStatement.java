package IfElse;

public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Lulus");
                break;
            case "D":
                System.out.println("Masih Lulus");
                break;
            default:
                System.out.println("Tidak lulus");
        }

        //switch lambda
        switch (nilai) {
            case "A" -> System.out.println("Lulus dengan baik");
            case "B", "C" -> System.out.println("Lulus");
            case "D" -> System.out.println("Masih Lulus");
            default -> {
                System.out.println("Tidak Lulus");
            }
        }

        //switch tanpa kata kunci yield
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Lulus dengan baik";
            case "B", "C" -> ucapan = "Lulus";
            case "D" -> ucapan = "Masih Lulus";
            default -> {
                ucapan = "Tidak Lulus";
            }
        }

        System.out.println(ucapan);

        //switch dengan kata kunci yield
        ucapan = switch (nilai) {
            case "A" : yield "Lulus dengan baik";
            case "B", "C" : yield "Lulus";
            case "D" : yield "Masih Lulus";
            default : {
                yield "Tidak Lulus";
            }
        };

        System.out.println(ucapan);
    }
}
