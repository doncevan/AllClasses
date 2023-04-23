package class03;

public class E14TypeCasting {
    public static void main(String[] args) {
        short num=1260;
       // byte num2=num;// smoker box can not hold bigger box's value
        byte num2=(byte)num;
        System.out.println(num2);// -20 is unexpected result

    }
}
