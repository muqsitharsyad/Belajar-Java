package generic.application;

import generic.Pair;

public class pairApp {
    public static void main(String[] args) {
        Pair<String, Integer> pairData = new Pair<String, Integer>("Kinmin", 100);
        System.out.println(pairData.getFirst());
        System.out.println(pairData.getSecond());
    }
}
