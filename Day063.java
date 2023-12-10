package prosedur;

import java.util.Scanner;

public class Prosedur {
    public static void ctrl(String nm, int umur) {
        System.out.println("nama " + nm + " berumur " + umur + " tahun");
    }
    public static void main(String[] args) {
        String nm;
        int umr;
        Scanner coc = new Scanner (System.in);
        System.out.print("nama : ");
        nm = coc.nextLine();
        System.out.print("umur : ");
        umr = coc.nextInt();
        System.out.println("output :");
        ctrl(nm,umr);
                
    }
    
    
}
