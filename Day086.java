public class Day086 {
    public static void main(String[] args) {
        String nama = "Asep very cool guy";
        System.out.println("jmlh charakter\t : "+nama.length());
        System.out.println("uppercasse\t : "+nama.toUpperCase());
        System.out.println("lowercase\t : "+nama.toLowerCase());
        System.out.println("char[0]\t\t : "+nama.charAt(0));
        String[] kata = nama.split(" ");
        System.out.println("nama depan\t : "+kata[0]);
        System.out.println("jmlh kata\t : "+kata.length);
    }
}
