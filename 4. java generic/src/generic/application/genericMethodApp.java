package generic.application;

import generic.genericMethod;

public class genericMethodApp {
    public static void main(String[] args) {
        String[] names = {"Kin", "Min"};
        Integer[] numbers = {1,2,3};

        System.out.println(genericMethod.<String>count(names));
        System.out.println(genericMethod.count(numbers));
    }
}
