package dowhile;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        System.out.println("=== Do While ===");
        String nama, alamat, loop;
        do {
            Scanner a = new Scanner(System.in);
            System.out.print("Nama    : ");
            nama = a.nextLine();
            System.out.print("Alamat  : ");
            alamat = a.nextLine();
            System.out.println(nama + " tinggal di " + alamat);
            System.out.println("-------------------");
            System.out.print("Ulang? y/n : ");
            loop = a.next();
            System.out.println("-------------------");
        } while (loop.equalsIgnoreCase("y"));
        System.out.println("Selesai");

    }

}
}
