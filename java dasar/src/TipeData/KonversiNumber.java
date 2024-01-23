package TipeData;

public class KonversiNumber {
    public static void main(String[] args) {
        //widening casting (otomatis) dari kecil ke besar byte->short->int->long->float->double
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        //narrowing casting (manual) dari besar ke kecil
        byte iniByte2 = (byte) iniInt;
    }
}
