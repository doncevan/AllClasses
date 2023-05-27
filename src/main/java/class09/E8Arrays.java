package class09;

public class E8Arrays {
    public static void main(String[] args) {
        // write a loop to count false values
        boolean[] flags = {true, false, true, false, false, true};
        int counter=0;
        for (int i = 0; i < flags.length; i++) {
            if (!flags[i]) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}