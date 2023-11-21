package breakcontinue;

public class main {

    public static void main(String[] args) {
        System.out.println("===Break===");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.print(i);

        }
        System.out.println("\n===Continue===");
        for (int j = 1; j <= 8; j++) {
            if (j == 4) {
                continue;
            }
            System.out.print(j);
        }
        System.out.println();
    }
}
