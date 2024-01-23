package Method;

public class MethodRecursive {
    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
        System.out.println(factorialRecursive(10));
    }

    static int factorialLoop(int value){
        var result = 1;
        for (var counter = 1; counter <= value; counter++){
            result *= counter;
        }

        return result;
    }

    //recursive
    static int factorialRecursive(int value){
        if (value == 1){
            return 1;
        }else {
            return value * factorialRecursive(value - 1);
        }
    }
}
