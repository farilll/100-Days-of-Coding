import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day095 {
    public static void main(String[] args) throws IOException {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        String nm, nim, kls;
        System.out.println("=== BIODATA ===");
        System.out.print("Nama\t : ");
        nm = x.readLine();
        System.out.print("Nim\t : ");
        nim = x.readLine();
        System.out.print("Kelas\t : ");
        kls = x.readLine();
        System.out.println("============");
        System.out.println("nama\t : "+nm);
        System.out.println("nim\t : "+nim);
        System.out.println("kelas\t : "+kls);
        
    }
}
