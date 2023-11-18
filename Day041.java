package Fibonacci;

import java.util.Scanner;


public class main {

    public static void main(String[] args) {
       Scanner a = new Scanner(System.in);
       int f1 = 0;
       int f2 = 1;
       System.out.print("Masukkan angka : ");
       int n = a.nextInt();
       
       System.out.print(f1 + ", ");
       System.out.print(f2);
       int fn;
       for (int b = 1; b < n; b++){
       fn = f2 + f1;
       System.out.print(" , " + fn);
       f1 = f2;
       f2 = fn;
       }
       System.out.println(" ");
    }
    
}
