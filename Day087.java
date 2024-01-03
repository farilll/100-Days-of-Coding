import java.util.Scanner;

public class Day087 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("input tanggal\t : ");
        String tglLahir = x.nextLine();
        System.out.println("");
        String[] ini = tglLahir.split(" ");
        String tgl = ini[0];
        String bln = ini[1];
        String thn = ini[2];
        System.out.println("tanggal\t : "+tgl);
        System.out.println("bulan\t : "+bln);
        System.out.println("tahun\t : "+thn);
        System.out.println("\n["+tglLahir+"]");
}
}
