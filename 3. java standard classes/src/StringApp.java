public class StringApp {
    public static void main(String[] args) {
        String name = "KinMin";
        String lowerCase = name.toLowerCase();
        String upperCase = name.toUpperCase();
        String[] split = name.split("M");

        System.out.println(lowerCase);
        System.out.println(upperCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Kin"));
        System.out.println(name.endsWith("Min"));

        for (var value : split){
            System.out.println(value);
        }

        System.out.println(name.charAt(1));

        char[] chars = name.toCharArray();
        System.out.println(chars);
    }
}
