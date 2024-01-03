public class Day084 {
    public static int luasPersegi (int s){
        int l = s * s;
        return(l);
    }
    public static int kelilingPersegi (int s){
        int k = 4 * s;
        return(k);
    }
    public static void main(String[] args) {
        int s = 6;
        System.out.println("luas = "+luasPersegi(s));
        System.out.println("luas = "+kelilingPersegi(s));
    }
}
