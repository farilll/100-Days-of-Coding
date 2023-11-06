package Day030;
import java.util.Scanner;

public class main{
        public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        int angka;
        
        System.out.print("Masukkan angka; ");
        angka = x.nextInt();
        
        if (angka %2 == 0 ){
          System.out.println("Angka " + angka + " adalah bilangan genap");
        }else {
          System.out.println("Angka " + angka + " adalah bilangan ganjil");
        }
    }
}
