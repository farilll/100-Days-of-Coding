package Day021;
import java.math.BigDecimal;

public class main{
    public static void main(String[] args) {
        // Membuat objek BigDecimal
        BigDecimal bigDec1 = new BigDecimal("1111.2222");
        BigDecimal bigDec2 = new BigDecimal("1111.3333");

        // Melakukan operasi penjumlahan
        BigDecimal hasilPenjumlahan = bigDec1.add(bigDec2);
        System.out.println("Penjumlahan: " + hasilPenjumlahan);

        // Melakukan operasi pengurangan
        BigDecimal hasilPengurangan = bigDec1.subtract(bigDec2);
        System.out.println("Pengurangan: " + hasilPengurangan);

        // Melakukan operasi perkalian
        BigDecimal hasilPerkalian = bigDec1.multiply(bigDec2);
        System.out.println("Perkalian: " + hasilPerkalian);

    }
}
