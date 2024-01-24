package Method;

public class MethodReturnValue {
    public static void main(String[] args) {
        var result = sum(100, 100);
        System.out.println(result);
    }
    static int sum(int val1, int val2){
        var total = val1 + val2;
        return total;
    }
    static int hitung(int val1, String operasi, int val2){
        switch (operasi){
            case "+":
                return val1 + val2;
            case "-":
                return val1 - val2;
            default:
                return 0;
        }
    }
}
