package Day009;

import java.util.Scanner;


public class main {

  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Masukkan Nilai Anda : ");
  int Nilai = input.nextInt();
  
  if (Nilai >= 85){
    System.out.println("Anda mendapatkan Nilai A");
  }else if (Nilai >= 80){
    System.out.println("Anda mendapatkan Nilai B");
  }else if (Nilai >= 70){
    System.out.println("Anda mendapatkan Nilai C");
  }else{
    System.out.println("Anda Mengulang Tahun Depan");
  }
}
}
