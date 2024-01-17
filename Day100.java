import java.util.LinkedList;

public class Day100 {
    public static void main(String[] args) {
        LinkedList<String> nama = new LinkedList<>();

        nama.add("udin");
        nama.add("asep");
        nama.add("ujang");
        nama.add("saipul");

        nama.addFirst("jambul");
        nama.addLast("bujang");

        nama.set(0, "jarwo");
        nama.set(3, "sopo");

        System.out.println("nama\t\t: "+nama);
        System.out.println("jumlah nama\t: "+nama.size());
        System.out.println("nama pertama\t: "+nama.getFirst());
        System.out.println("nama terakhir\t: "+nama.getLast());
        System.out.println("nama No index 4\t: "+nama.get(4));
    }
}
