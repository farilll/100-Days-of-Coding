package Day027;

public class Main {
    
    public static void main(String[] args) {
        
        String a = "123";
        int angka = Integer.parseInt(a);
        
        String b = "3.14";
        double nilaiDouble = Double.parseDouble(b);
        
        String c = "true";
        boolean nilaiBoolean = Boolean.parseBoolean(c);
        
        System.out.println("Hasil konversi int: " + angka);
        System.out.println("Hasil konversi double: " + nilaiDouble);
        System.out.println("Hasil konversi boolean: " + nilaiBoolean);
        
    }
    }

