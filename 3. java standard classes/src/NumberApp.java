public class NumberApp {
    public static void main(String[] args) {
        Integer intVal = 10;

        Long longVal = intVal.longValue();
        Double doubleVal = intVal.doubleValue();
        Short shortVal = intVal.shortValue();

        //primitif
        int num = 10;
        //non primitif
        Integer number = 10;

        String contoh = "1000000";

        Integer conv = Integer.valueOf(contoh);
        System.out.println(conv);
    }
}
