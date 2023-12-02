package array7;

import java.util.Scanner;

public class Array7 {

    public static void main(String[] args) {
        int[] angka = {1, 2, 3, 4, 5};
        int cari, count = 0;
        Scanner x = new Scanner(System.in);
        System.out.print("data : ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print (angka[i] + " ");
        }
        System.out.println("");
        System.out.print("Cari : ");
        cari = x.nextInt();
        System.out.println("---------");
        System.out.println("Hasil cari: ");
        for (int i = 0; i < angka.length; i++) {
            if (cari == angka[i]) {
                System.out.println("index ke-" + i);
                count++;
            }
          
            }
          if (count == 0) {
                System.out.println("Data tidak tersedia!");
        }
    }

}
