package array11;

public class Array11 {

    public static void main(String[] args) {
        int[] a = {22, 33, 44};
        int total = 0;
        double rata;
        int jml_index = a.length;
        System.out.print("Deret angka : ");
        for (int i = 0; i < jml_index; i++) {
            System.out.print(a[i]+" ");
            total += a[i];
            
        }
        System.out.println();
        System.out.println("total : " + total);
        rata = total/jml_index;
        System.out.println("rata : " + rata);
    }
    
}
