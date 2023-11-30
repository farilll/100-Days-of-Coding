package array4;

public class Array4 {

    public static void main(String[] args) {
    int [] a = {10, 20, 30};
    int total = 0;
    int jmlh = a.length;
        System.out.print("Deret angka : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            total += a[i];
        }
        System.out.println("\n---------");
        System.out.println("Total : " + total);
    }
    }
