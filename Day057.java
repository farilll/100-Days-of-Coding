package array10;

public class Array10 {

    public static void main(String[] args) {
     String[][] x ={
         {"Charla", "\t (Mars)"},
             {"Starla", "\t (Merukurius)"},
             {"Erin", "\t (Venus)"}
     };
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j]);
            }
            System.out.println();
        }
         
    }
    }
