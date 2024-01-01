import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
       
        Scanner coc = new Scanner(System.in);
        System.out.println("===KALKULATOR===");
        int a,b,kali,tambah,kurang,bagi;
        System.out.print("Angka A : ");
        a = coc.nextInt();
        System.out.print("Angka B : ");
        b = coc.nextInt();

        kali = a*b;
        tambah = a+b;
        kurang = a-b;
        bagi = a/b;
        System.out.println("\n===HASIL===");
        System.out.println("hasil kali   : " + kali);
        System.out.println("hasil tambah : " + tambah);
        System.out.println("hasil kurang : " + kurang);
        System.out.println("hasil bagi   : " + bagi);
        
    }
}
