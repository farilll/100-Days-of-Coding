package gajiLembur;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int gaji,lembur,hasil;
        System.out.print("gaji : ");
        gaji = x.nextInt();
        System.out.print("lama lembur : ");
        lembur = x.nextInt();
        hasil = lembur*55000;
        System.out.println("total gaji anda : " + hasil);
        }
        }
