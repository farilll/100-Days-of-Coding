package arrayfor;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int x;
        Scanner coc = new Scanner (System.in);
        System.out.print("Jumlah index : ");
        x = coc.nextInt();
        int a[] = new int [x];
        System.out.println("Input :");
        System.out.println("-------");
        for (int i = 0; i < x; i++) {
            System.out.print("index ke-" + i + " : ");
            a[i] = coc.nextInt();
        }
        System.out.println("-------");
        System.out.println("Output :");
        for (int i = 0; i < x; i++) {
             System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
}
