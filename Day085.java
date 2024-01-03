public class Day085 {
    public static void main(String[] args) {
        int x = 10, y = 2, z;
        try {
            z = x / y;
            System.out.println("Hasil : "+z);
        } catch (Exception e) {
           System.out.println("pembagi salah");
        }
    }
}
