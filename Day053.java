package array5;

import java.util.Arrays;
import java.util.Collections;

public class Array5 {

    public static void main(String[] args) {
        Integer[] a = {40, 60, 30, 10,};
        int b = Collections.max(Arrays.asList(a));
        int c = Collections.min(Arrays.asList(a));
        System.out.println("Max: " + b);
        System.out.println("Max: " + c);
    }

}
