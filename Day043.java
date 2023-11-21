package Day043;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner coc = new Scanner (System.in);
        System.out.print("Masukkan angka: ");
        int tinggi = coc.nextInt();
        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= tinggi; j++) {
                System.out.print(" o ");
        }
        System.out.println(" o ");
    }
}

}
