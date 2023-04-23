package class13;

public class Task02 {
    public static void main(String[] args) {
        /* Create a String that should be combination of letters, numbers and special characters.
        Find out how many Alphabet(abd AZ ) characters are there in the String.*/
        String str = "vfjnbfkjnJFNVLKDNFKLVB64757478574*&^*&%";
        String str1=str.replaceAll("[^A-Za-z]","");
        System.out.println(str1);
        System.out.println(str1.length());
        //System.out.println(str1.replaceAll("[^A-Za-z]","").lenght());

    }
}
