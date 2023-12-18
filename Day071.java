package Looping;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {       
        Scanner sc = new Scanner (System.in);
        System.out.print("masukkan nilai : ");
        int a = sc.nextInt();
        int kkm = 75;
        String hasil = a >= kkm? "lulus" : "Nice try, coba lagi tahun depan";
        System.out.println("nilai kamu : "+a);
        System.out.println(hasil);
    }
    
}
