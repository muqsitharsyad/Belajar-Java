package Looping;

public class ForLoop {
    public static void main(String[] args) {
        // for(init statement; condition; post statement)
//        for (;;){
//            System.out.println("Perulangan tanpa henti");
//        }

        var counter = 1;
        for (; counter <= 10 ;){
            System.out.println("Perulangan " + counter);
            counter++;
        }

        for (var itung = 1; itung <= 10; itung++){
            System.out.println("Perulangan " + itung);
        }
    }
}
