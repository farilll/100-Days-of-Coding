package prosedur_fungsi;

public class Prosedur_fungsi {

    public static void mahasusah() {
        String nama = "angel";
        int umur = 17;
        System.out.println(nama + " " + umur + " thn");
    }

    public static String kedua() {
        String nama = "Mawar";
        int umur = 18;
        return nama + " " + umur+" thn";
    }

    public static void main(String[] args) {
        mahasusah();
        System.out.println(kedua());
    }

}
