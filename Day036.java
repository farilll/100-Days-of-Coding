package Day036;

public class main {

    public static void main(String[] args) {
        System.out.println("=== PERULANGAN ===");
        System.out.println("\n");

        System.out.println("PERTAMA");
        System.out.println("awal program");
        for (int i = 0; i <= 10; i++) {
            System.out.println("for loop ke-" + i);

        }
        System.out.println("akhir program");

        System.out.println("\n");
        System.out.println("KEDUA");
        System.out.println("awal program");
        for (int i = 0; i < 10; i++) {
            System.out.println("for loop ke-" + i);

        }
        System.out.println("akhir program");

        System.out.println("\n");
        System.out.println("KETIGA");
        System.out.println("awal program");
        for (int i = 10; i >= 0; i--) {
            System.out.println("for loop ke-" + i);

        }
        System.out.println("akhir program");

        System.out.println("\n");
        System.out.println("KEEMPAT");
        System.out.println("awal program");
        int i = 5;
        for (;i < 10; i++) {
            System.out.println("for loop ke-" + i);
            
        }
        System.out.println("akhir program");
    }
}
