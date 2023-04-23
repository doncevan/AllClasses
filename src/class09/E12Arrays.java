package class09;

public class E12Arrays {
    public static void main(String[] args) {
        int[] numbers=new int[5];
        numbers[0]=50;
        numbers[1]=60;
        numbers[2]=70;
        numbers[3]=80;
        numbers[4]=90;
        for (int number : numbers) {
            System.out.println(number);

        }
        System.out.println();
        int[] numbers1=new int[5];
        int num=50;
        for (int i=0;i<numbers1.length;i++) {
            numbers1[i]=num;
            num=num+10;
        }
        for (int number:numbers1){
            System.out.print(number+"  ");
        }
    }
}
