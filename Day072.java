package uas;

import java.util.Scanner;

public class Uas {

    public static void main(String[] args) {
        Scanner coc = new Scanner(System.in);
        String[][] data = new String[2][3];

        for (int i = 0; i < 2; i++) {
            System.out.print("masukkan nama : ");
            data[i][0] = coc.nextLine();
            System.out.print("masukkan nim  : ");
            data[i][1] = coc.nextLine();
            System.out.print("masukkan nilai: ");
            data[i][2] = coc.nextLine();
            System.out.println("==============");
            System.out.print("\n");
        }
        System.out.println("===cetak data===");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }

    }
}
