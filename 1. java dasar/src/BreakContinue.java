public class BreakContinue {
    public static void main(String[] args) {
        //Break
        var counter = 1;

        while (true){
            System.out.println("Perulangan " + counter);
            counter++;

            if (counter > 10){
                break;
            }
        }

        System.out.println("perulangan berhenti");

        //Continue
        for (var itung = 1; itung <= 100; itung++){
            if (itung % 2 == 0){
                continue;
            }
            System.out.println("Perulangan Ganjil" + itung);
        }
    }
}
