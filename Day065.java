package prosedur_operasi;

import java.util.Scanner;

public class main {
    public static void ctrl(int a, int b) {
        int c;
        c = a+b;
        System.out.println(a+" + "+b+" = "+c);
        c = a-b;
        System.out.println(a+" - "+b+" = "+c);
        c = a/b;
        System.out.println(a+" / "+b+" = "+c);
        c = a*b;
        System.out.println(a+" * "+b+" = "+c);
    }
    public static void main(String[] args) {
        Scanner coc = new Scanner(System.in);
        System.out.print("angka : ");
        int a = coc.nextInt();
        System.out.print("angka : ");
        int b = coc.nextInt();
        System.out.println("output : ");
        ctrl(a,b);
    }
    
}
