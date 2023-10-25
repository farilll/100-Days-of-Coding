package Day018;

import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        
        Integer a = new Integer(100); 
        Double b = new Double(100.1); 
        Boolean c = new Boolean(false); 
        String d = new String("Hello guys");
        
        //mengakses nilai dari tipe data non primitif       
        int integerValue = a.intValue();
        double doubleValue = b.doubleValue();
        boolean booleanValue = c.booleanValue();
        String stringValue = d.toString();

        System.out.println("Nilai Integer 	: " + integerValue);
        System.out.println("Nilai Double	  : " + doubleValue);
        System.out.println("Nilai Boolean	  : " + booleanValue);
        System.out.println("Nilai String	  : " + stringValue);

    }
}
