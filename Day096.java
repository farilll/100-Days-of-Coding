import java.util.ArrayList;
import java.util.Scanner;

public class Day096 {

    public static void main(String[] args) {
        ArrayList<String> namaList = new ArrayList<>();
        Scanner x = new Scanner(System.in);
        System.out.println("Masukkan beberapa nama (ketik 'selesai' untuk berhenti) : ");
        while (true) {
            String nama = x.nextLine();
            if (nama.equalsIgnoreCase("selesai")){
                break;
            }
            namaList.add(nama);
        }
        System.out.println("\nDaftar nama : ");
        for (String nama : namaList) {
            System.out.println(nama);
        }
    }
}
