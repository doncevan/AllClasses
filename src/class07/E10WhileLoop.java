package class07;

public class E10WhileLoop {
    public static void main(String[] args) {
        //print numbers:1,2,4,5,7,8,10,11,13,14,16,17,19,20
        int a =1;
        while(a<=20){
            if(a%3!=0){  // or this way: if(a!=3&&a!=6&&a!=9&&a!=12...) excluding %3(modules)- shorter way
                System.out.print(a+" ");
            }
            a++;
        }

    }
}
