public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Kin");
        builder.append(" ");
        builder.append("Min");

        String name = builder.toString();
        System.out.println(name);
    }
}
