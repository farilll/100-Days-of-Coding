package Day037;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int pil, porsi, harga = 0;
        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1.Bakso \n2.Pecel lele \n3.Mie ayam \n4.Ayam geprek");
        System.out.print("Pilih: ");
        pil = a.nextInt();

        switch (pil) {
            case 1:
                System.out.println("Bakso 8k/porsi");
                System.out.print("Porsi: ");
                porsi = a.nextInt();
                harga = 8000 * porsi;
                break;
            case 2:
                System.out.println("Pecel lele 15k/porsi");
                System.out.print("Porsi: ");
                porsi = a.nextInt();
                harga = 15000 * porsi;
                break;
            case 3:
                System.out.println("Mie ayam 10k/porsi");
                System.out.print("Porsi: ");
                porsi = a.nextInt();
                harga = 10000 * porsi;
                break;
            case 4:
                System.out.println("Ayam geprek 13k/porsi");
                System.out.print("Porsi: ");
                porsi = a.nextInt();
                harga = 13000 * porsi;
                break;
            default:
                System.out.println("Tidak ada dalam menu");
        }
        System.out.println("Total: " + harga);
    }

}
