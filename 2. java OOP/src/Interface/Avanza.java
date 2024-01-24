package Interface;

public class Avanza implements Car, Maintenance{

    public void drive() {
        System.out.println("Avanza drive");
    }

    public int getTire() {
        return 4;
    }

    public boolean isMaintenance() {
        return false;
    }
}
