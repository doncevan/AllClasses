package class13;

public class Printer {

    void printSomething(){
        System.out.println("Hello Java");
        System.out.println("Hello Java");
        System.out.println("Hello Java");
        System.out.println("Hello Java");

    }
    void printWord(String word){
        System.out.print(word);
        System.out.print(word);
        System.out.print(word);
        System.out.print(word);
    }
    void printWordManyTimes(String word,int number){
        for (int i = 0; i < number; i++) {
            System.out.print(word+" ");
        }
    }
}
