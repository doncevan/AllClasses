package class04;

public class E12NestedIf {

    public static void main(String[] args) {

        if(10>5){ // equations on both lines can be replaced with true/false statement

            if(20>3){ // both conditions should be met (there can be many of them)
                System.out.println("Inside the nested if");
            }
        }
    }
}