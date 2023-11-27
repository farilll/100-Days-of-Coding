package arraynonprimitif;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner coc = new Scanner (System.in);        
        String[] buah = new String [4];
        
        System.out.println("Intput :");
        System.out.println("--------");       
        for(int i = 0; i < buah.length; i++){
          System.out.print("Buah ke-" + i + " : ");
          buah[i] = coc.nextLine();
        }
        System.out.println("\nOutput :");
        System.out.println("-------");
        for(String x : buah){
          System.out.println("-" + x);
        }
}
}
