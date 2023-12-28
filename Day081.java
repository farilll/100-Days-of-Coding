package soaluas;

import java.util.Scanner;

public class SoalUas {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int satu, dua, hasil;
        System.out.print("angka pertama = ");
        satu = x.nextInt();
        System.out.print("angka kedua = ");
        dua = x.nextInt();
        hasil = satu + dua;
        System.out.println("jumlah = "+hasil);
        if (hasil %2 == 0){
            System.out.println("hasilnya genap maka ditambah 1 = "+(hasil+1));
        }else{
            System.out.println("hasilnya ganjil maka ditambah 2 = "+(hasil+2));
        }
    }
    
}
