package class13;

public class E4StringDemo {
    public static void main(String[] args) {
        String str="Today is Sunday! We have java class. We like java";
        String [] strArr=str.split("[.!]");
        System.out.println(strArr.length);
        System.out.println(strArr[0]);
        System.out.println(strArr[2].trim());
        System.out.println(strArr[1].trim());
    }
}
