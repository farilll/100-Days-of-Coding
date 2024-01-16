public class Day099 {
    public static void main(String[] args) {
        String kalimat = "Asep makan sate";
        // charAt
        System.out.println(kalimat.charAt(5));

        // substring
        String kata = kalimat.substring(5,10);
        System.out.println(kata);

        //concatenation
        String kata2 = kata.concat(" pisang");
        System.out.println(kata2);

        // concat dengan non String 
        byte jumlah = 8;
        String kata3 = kata2 + " " + jumlah;
        System.out.println(kata3);
    }
}
