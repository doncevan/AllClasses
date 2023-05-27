package class06;

public class E3LogicalOperators {
    public static void main(String[] args) {

        boolean rich = true;
        boolean invitationFromRR = false;

        if (rich && invitationFromRR) {   //false
            System.out.println("Yes you can buy RR");
        } else {
            System.out.println("You can't but RR");
        }
    }
}
