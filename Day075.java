package soalkodingwar;

import java.util.Scanner;

public class SoalKodingWar {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String menu = null;
        int pilih, harga = 0, porsi;
        System.out.println("=== MENU ===");
        System.out.println("1.Bakso \n2.Ayam geprek \n3.Coto makassar");
        System.out.print("pilih :");
        pilih = x.nextInt();
        if (pilih == 1) {
            menu = "Bakso";
            harga = 10000;
        } else if (pilih == 2) {
            menu = "Ayam geprek";
            harga = 13000;
        } else if (pilih == 3) {
            menu = "Coto makassar";
            harga = 15000;
        }
        if (menu == null) {
            System.out.println("Lihat baek-baek ki menunya bgsd");
        } else {
            System.out.print("Jumlah porsi : ");
            porsi = x.nextInt();
            System.out.println("=== MENU DIPESAN ===");
            System.out.println(menu + " Rp." + harga + "/porsi");
            harga = harga * porsi;
            System.out.println("Total pesanan anda : " + harga);

        }

    }

}
