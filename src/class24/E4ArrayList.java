package class24;

public class E4ArrayList {
    public static void main(String[] args) {
        Integer integer = new Integer(10); // this is boxing and is not used in latest IDE's
        Integer integer1 = 10; // converts primitives to a wrapper type and is called autoboxing
        int num = integer1.intValue(); // unboxing is not used anymore
        int num2 = integer1; //auto unboxing

        Integer integer2 = 10;
        int number = integer2;
        System.out.println(number);
    }
}
