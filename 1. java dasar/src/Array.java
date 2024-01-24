public class Array {
    public static void main(String[] args) {
        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "K";
        stringArray[1] = "I";
        stringArray[2] = "N";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        //penulisan array
        String[] stringArray2 = new String[3];

        String[] namaNama = {
                "K", "I", "N"
        };

        int[] arrayInt = new int[]{
                1,2,3,4,5
        };

        long[] arrayLong = {
                10L, 20L, 30L
        };

        System.out.println(arrayLong.length);

        //array dalam array
        String[][] members = {
                {"A", "B"},
                {"C", "D"},
                {"E"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);

    }
}
