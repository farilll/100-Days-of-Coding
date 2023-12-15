package a;
 
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner coc = new Scanner (System.in);
        System.out.print("Jumlah index : ");
        int x = coc.nextInt();
   
        for (int i = 1; i <= x; i++) {
            System.out.print("angka ke-"+i+":");
            int c = coc.nextInt();
            
            if (c %2 == 0){
              System.out.println("Bilangan genap");
            }else{
              System.out.println("bilangan ganjil");
            }
        
       
        System.out.println();
    }
  
    
    }
    }
   
