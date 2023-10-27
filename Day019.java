package Day019;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer jumlah = 0;
        Integer bilangan;
        Integer jumlahBilangan = 0;
        double rataRata;
        System.out.print("Masukkan jumlah bilangan: ");
        jumlahBilangan = input.nextInt();

        for (int i = 0; i < jumlahBilangan; i++) {
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
            bilangan = input.nextInt();
            jumlah += bilangan;
        }

        rataRata = jumlah / jumlahBilangan;
        System.out.println("Rata-rata: " + rataRata);
    }
}

