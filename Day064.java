package prosedur_genjigenap;

import java.util.Scanner;

public class main{

    public static void main(String[] args) {
        Scanner coc = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int x = coc.nextInt();
        halo(x);
    }

    public static void halo(int angka) {
        if (angka %2 == 0) {
            System.out.println("bilangan genap");
        } else {
            System.out.println("bilngan ganjil");
        }

    
    }
}
