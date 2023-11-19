package pola;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner coc = new Scanner (System.in);
        System.out.print("Masukkan angka = ");
        int pola = coc.nextInt();
        for (int i = 1; i <= pola; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("o ");
            }
            System.out.println("o");
        }
    }

}
