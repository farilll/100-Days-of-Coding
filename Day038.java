package Day038;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("=== Ternary Operator ===");
        int input, x;
       
        System.out.print("Masukkan nilai: ");
        input =  a.nextInt();
        
        x = (input == 20) ? (input*input) : (input/2);     
        System.out.println("Hasil: " + x);  
             
    }
    

}
