package Day011;

import java.util.Scanner;

public class main {
  public static void main(String[] args) {
  System.out.println("===========BIODATA MAHASISWA=========");
  
        String nama, nim, kelas;  
        int  PAK, MTK, BINDO, PK, FSK, DDP, PSTI, PS;
        double mean;
        Scanner input = new Scanner (System.in);
        System.out.print("Nama      : ");
        nama = input.nextLine();
        System.out.print("Nim       : ");
        nim = input.nextLine();
        System.out.print("Kelas     : ");
        kelas = input.nextLine();
 
        System.out.println("                                     ");
  
        System.out.println("=============MATA KULIAH=============");
        System.out.print("PENDIDIKAN AGAMA KRISTEN           : ");
        PAK= input.nextInt();
        System.out.print("MATEMATIKA                         : ");
        MTK = input.nextInt();
        System.out.print("BAHASA INDONESIA                   : ");
        BINDO = input.nextInt();
        System.out.print("PENDIDIKAN KEWARGANEGARAAN         : ");
        PK = input.nextInt();
        System.out.print("FISIKA ELEKTRONIKA                 : ");
        FSK = input.nextInt();
        System.out.print("DASAR DASAR PEMROGRAMAN            : ");
        DDP = input.nextInt();
        System.out.print("PSTI                               : ");
        PSTI = input.nextInt();
        System.out.print("PENDIDIKAN PANCASILA               : ");
        PS = input.nextInt();
        
        mean  = (double) (PAK+MTK+BINDO+PK+FSK+DDP+PSTI+PS)/8;
        System.out.print("NILAI RATA RATA ANDA : "+mean);
}
}
