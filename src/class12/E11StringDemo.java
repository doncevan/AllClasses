package class12;

public class E11StringDemo {
    public static void main(String[] args) {
        String name = "Today is Saturday";
       /* System.out.println(name.indexOf('i'));
        System.out.println(name.indexOf('a'));// returns first index number of 'a'
        System.out.println(name.indexOf('a',4));// start searching from index 4*/
        //print all indexes where the letter 'a' appears
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a') {
                System.out.print(i + " ");

               // System.out.print(name.charAt(i) + " "); prints all three letters 'a'
            }
        }
    }
}