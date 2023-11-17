package Day040;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner coc = new Scanner (System.in);
        System.out.println("=== WHILE ===");
        int awal, akhir, b;
        System.out.print("awal      : ");
        awal = coc.nextInt();
        System.out.print("akhir     : ");
        akhir = coc.nextInt();
        b = awal;
        while (b >= akhir){
            System.out.println(b + " ");
            b--;
        }
        System.out.println("");
    }
    
}
