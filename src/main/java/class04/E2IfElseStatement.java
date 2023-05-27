package class04;

public class E2IfElseStatement {
    public static void main(String[] args) {
     // String is not primitive data type, and we can't use it
        String name="Jacob";

        if(name.equals("Ivan")) {  // checks if true or false and executes accordingly (Jacob vs Ivan)
            System.out.println("I like swimming");
        }else{
            System.out.println("I like programming");
        }

    }
}
