package class12;

public class E1StringClassDemo {
    public static void main(String[] args) {
        String s=new String("Leandro");// equals to String s="Leandro";
        System.out.println(s.length());

        String name="Justin Chukwudiuche";
        if (name.length()>8){
            System.out.println("Only 8 characters are allowed");
        }
    }
}
