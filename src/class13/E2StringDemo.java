package class13;

public class E2StringDemo {
    public static void main(String[] args) {
        // !!!   refer to ASCII table for variety of replacements   !!!
        String str = "vfjnbfkjnJFNVLKDNFKLVB64757478574*&^*&%";
        System.out.println(str.replaceAll("[a-z]", "*"));
        System.out.println(str.replaceAll("[A-Z]", "#"));
        System.out.println(str.replaceAll("[0-9]", "%"));
        System.out.println(str.replaceAll("[a-z0-9]", "@"));
        System.out.println(str.replaceAll("[a-zA-Z0-9]", "!"));
        System.out.println(str.replaceAll("[a-zA-Z0-9]", "a"));
        System.out.println(str.replaceAll("[A-z]", "#"));

        char c='A';
        System.out.println(c);
        for (int i = 0; i < 10; i++) {
            System.out.println(c++);

        }
    }
}
