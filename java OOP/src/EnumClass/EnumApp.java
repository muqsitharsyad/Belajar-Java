package EnumClass;public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Kinmin");
        customer.setLevel(Level.VIP);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        //konversi enum
        String levelName = Level.STANDARD.name();
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        System.out.println("Print semua level");
        for (var value : Level.values()){
            System.out.println(value);
        }
    }
}
