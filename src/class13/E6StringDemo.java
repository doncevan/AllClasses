package class13;

public class E6StringDemo {
    public static void main(String[] args) {
        String str="Wife";   //immutable or not changing
        str.toLowerCase();
        System.out.println(str);

        StringBuilder str2=new StringBuilder("Husband");    //mutable or can change
        str2.reverse();
        System.out.println(str2);

    }
}
