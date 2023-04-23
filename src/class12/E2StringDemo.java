package class12;

public class E2StringDemo {
    public static void main(String[] args) {
        String useName = "admin";
        String password = "pass123";
        if (useName.length() > 8 && password.length() > 8) {
            System.out.println("UserName and password can't be more than 8 characters");
        } else {
            System.out.println("Signup successful");

        }
    }
}
