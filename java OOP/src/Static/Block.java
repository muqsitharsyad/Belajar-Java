package Static;

public class Block {
    public static final int PROCESSOR;

    static {
        System.out.println("Mengakses Processor");
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
}
