package belajarpola;

public class Belajarpola {

    public static void main(String[] args) {
        int a = 5;
        for (int i = 1; i <= a; i++) {
            for (int j = i; j <= a; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
