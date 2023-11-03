package Day028;

public class main{
    public static void main(String[] mmmm) {
            
        String a = "111111111";
        long nilaiLong = Long.parseLong(a);
        
        String b = "17";
        byte nilaiByte = Byte.parseByte(b);        
        
        String c = "122";
        short nilaiShort = Short.parseShort(c);
        
        String d = "123";
        float nilaiFloat = Float.parseFloat(d);
        
        String e = "A";
        char iniChar = e.charAt(0);
        
        System.out.println("Hasil konversi long : " + nilaiLong);
        System.out.println("Hasil konversi byte : " + nilaiByte);
        System.out.println("Hasil konversi short: " + nilaiShort);
        System.out.println("Hasil konversi float: " + nilaiFloat);
        System.out.println("Hasil konversi char : " + iniChar);

    }
}
