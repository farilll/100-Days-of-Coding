package break;

public class main {

    public static void main(String[] args) {
         one: for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.println("i: " + i + ", j: " + j);
                if ( j == 2){
                    break one;
                }
            }
            System.out.println();
        }
    }
    
}
