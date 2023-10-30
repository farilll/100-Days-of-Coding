package Day022;

import java.math.BigInteger;

public class main {
   
    public static void main(String[] args) {
        // Membuat objek BigInteger
        BigInteger bigInt1 = new BigInteger("123456789012345678901234567890");
        BigInteger bigInt2 = new BigInteger("987654321098765432109876543210");

        // Melakukan operasi penjumlahan
        BigInteger hasilPenjumlahan = bigInt1.add(bigInt2);
        System.out.println("Penjumlahan: " + hasilPenjumlahan);

        // Melakukan operasi pengurangan
        BigInteger hasilPengurangan = bigInt1.subtract(bigInt2);
        System.out.println("Pengurangan: " + hasilPengurangan);

        // Melakukan operasi perkalian
        BigInteger hasilPerkalian = bigInt1.multiply(bigInt2);
        System.out.println("Perkalian: " + hasilPerkalian);

        // Melakukan operasi pembagian
        BigInteger hasilPembagian = bigInt1.divide(bigInt2);
        System.out.println("Pembagian: " + hasilPembagian);
    }
}
