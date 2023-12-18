package looping ;
import java.util.Scanner;
public class main {
    public static void main(String[]args){
        Scanner de = new Scanner(System.in);
        System.out.print("masukkan jumlah : ");
        int angka = de.nextInt();
        for(int i = 0; i < angka; i++){
            System.out.print("masukkan nilai : ");
            int nilai = de.nextInt();
            if(nilai % 2 != 0){
                System.out.println("ganjil");
            }else{
                System.out.println("genap");
                break;
            }
        }
    }
}
