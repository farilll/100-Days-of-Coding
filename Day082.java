package uts;

import java.util.Arrays;
import java.util.Scanner;

public class Uts {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String[] arrName = new String[4];
        for (int i = 0; i < arrName.length; i++) {
            System.out.print("nama ke - " + (i + 1) + " : ");
            arrName[i] = x.nextLine();
        }
        System.out.println(Arrays.toString(arrName));
    }
}
