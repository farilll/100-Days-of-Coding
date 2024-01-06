public class Day089 {
    public static void main(String[] args) {
        int x = 0;
        int y = 10;
        int z = x + (int) (Math.random()*((y-x)+1));
        System.out.println(z);
    }
}
