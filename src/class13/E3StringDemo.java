package class13;

public class E3StringDemo {
    public static void main(String[] args) {
        String str="jmjheD  VNKIY12  38654!  @#$%^^&*";
        System.out.println(str.replaceAll("[a-z]",""));
        System.out.println(str.replaceAll("[^a-z]",""));//symbol ^ plays role of exclude
        System.out.println(str.replaceAll("[^a-z0-9]","+"));
        System.out.println(str.replaceAll("[^a-z0-9]","\\$"));// special occasion
        System.out.println(str.replaceAll("[^a-z0-9A-Z]",""));
        System.out.println(str.replaceAll("[jDVN12]",""));
        System.out.println(str.replaceAll(" ","\\$"));
    }
}
