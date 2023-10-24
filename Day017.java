package Day017;

import java.util.Scanner;


public class main {
  public static void main(String[] args) {
    
  Scanner input = new Scanner (System.in);
  Double gaji;
    
  System.out.print("Masukkan gaji Anda : ");
  gaji = input.nextDouble();
  System.out.println("Gaji: " + gaji);
  
  if (gaji >= 5000000 && gaji < 10000000){
    System.out.println("Pajak 5%");
    System.out.println(gaji-(gaji*0.5));
    
  }else if (gaji >= 5000000){
    System.out.println("Pajak 10%");
    System.out.println(gaji-(gaji*0.1));
    
  }else{
    System.out.println("Tidak kena pajak");
  }
  
}
}
