public class Day094 {
    public static void main(String[] args) {
        String str, result;
        str = "Hello world!!!";
        result = "";

        for(int i = str.length()-1; i>=0; i--)
        result += str.charAt(i);
        System.out.println(result);
    }
}
