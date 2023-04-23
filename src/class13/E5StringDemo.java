package class13;

public class E5StringDemo {
    public static void main(String[] args) {
        StringBuilder str =new StringBuilder("Java");
        System.out.println(str.length());
        System.out.println(str.reverse());

        String str1="Computer"; // it is impossible to revers in String class
        StringBuilder str2=new StringBuilder(str1); // but using StringBuilder we can do that
        System.out.println(str2);
        str2.reverse();
        str1=str2.toString();
        System.out.println(str1);

    }
}
