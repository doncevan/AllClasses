package class12;

public class E12StringDemo {
    public static void main(String[] args) {
        // sunString is used to get a part of the complete String
        String sentence="yup we have another class";
        System.out.println(sentence.substring(7));
        System.out.println(sentence.substring(12,20));


        int startIndex=sentence.length()-5;//last five letters of sentences of any length
        System.out.println(sentence.substring(startIndex));
    }
}
