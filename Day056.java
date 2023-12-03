package array;

public class main {

    public static void main(String[] args) {
     
        String[][] mobil = new String[2][2];
        mobil[0][0] = "BMW";
        mobil[0][1] = "LAMBORGINI";
        mobil[1][0] = "BUGATI";
        mobil[1][1] = "FERRARI";
        System.out.println(mobil[0][0]);
        System.out.println(mobil[0][1]);
        System.out.println(mobil[1][0]);
        System.out.println(mobil[1][1]);

        System.out.println("---------");
        String[][] nama = {
            {"Charla", "\t (Mars)"},
            {"Chika", "\t (Neptunus)"}

        };
        System.out.print(nama[0][0]);
        System.out.println(nama[0][1]);
        System.out.print(nama[1][0]);
        System.out.println(nama[1][1]);

    }

    
}
