public class Day097 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("halo");
        System.out.println(builder);

        //append
        builder.append(" Udin very cool guy");
        System.out.println(builder);

        //insert
        builder.insert(10, "Asep ");
        System.out.println(builder);

        //delete
        builder.delete(9, 14);
        System.out.println(builder);

        //setcharAt
        builder.setCharAt(7, 'y');
        System.out.println(builder);

        //replace
        builder.replace(5, 9, "Asep");
        System.out.println(builder);

        //casting menjadi string
        String kalimat = builder.toString();
        System.out.println(kalimat);
    }
}
