package array8;

import java.util.Scanner;

public class Array8 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String[] nm = {"jeruk", "mangga", "apel"};
        String cari;
        int count = 0;

        System.out.println("buah : ");

        for (int i = 0; i < nm.length; i++) {
            System.out.println((i + 1) + ". " + nm[i]);
        }
        System.out.println("-------------");
        System.out.print("Cari : ");
        cari = x.nextLine();
        for (int i = 0; i < nm.length; i++) {
            if (cari.equals(nm[i])) {
                System.out.print("kamu suka " + nm[i]);
                count++;
            }

        }
        if (count == 0) {
            System.out.println("buah yang anda cari tidak tersedia");

        }
        System.out.println("");   
                

    }

}
