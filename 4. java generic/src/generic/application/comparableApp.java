package generic.application;

import generic.comparable;
import java.util.Arrays;

public class comparableApp {
    public static void main(String[] args) {
        comparable[] comparables = {
                new comparable("Kin","Jakarta"),
                new comparable("Min", "Bandung")
        };

        Arrays.sort(comparables);

        System.out.println(Arrays.toString(comparables));

    }
}
