package TipeData;

public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        //default value tipe data ini semuanya null
        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;
        iniByte = 100;

        System.out.println(iniByte);

        //konversi dari primitif ke bukan primitif
        int iniInt = 100;
        Integer iniObject = iniInt;

        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

        Long amount = 10000L;
    }
}
