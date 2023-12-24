package ratanilai;

import java.util.Scanner;

public class RataNilai {

    public static void main(String[] args) {
        Scanner coc = new Scanner (System.in);
        int index;
        double nilai, total = 0, rata;
        System.out.print("jumlah index : ");
        index = coc.nextInt();
        for (int i = 1; i <= index; i++) {
            System.out.print("nilai ke-"+i+": ");
            nilai = coc.nextDouble();
            total += nilai;
        }
        rata = total/index;
        System.out.println("total : "+total);
        System.out.println("rata-rata : "+rata);
        
    }

}
