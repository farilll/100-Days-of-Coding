package penjumlahan;

import java.util.Scanner;

public class Penjumlahan {

    public static void main(String[] args) {
        Scanner coc = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        int angka = coc.nextInt();
        int total = 0;
        for (int i = 1; i <= angka; i++) {
            total += i;
            System.out.print(i);
            if (i < angka) {
                System.out.print(" + ");
            }
        }
        System.out.print(" = " + total);
        System.out.println();
    }

}
