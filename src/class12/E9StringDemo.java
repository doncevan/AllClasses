package class12;

public class E9StringDemo {
    public static void main(String[] args) {
        String sentence="I don't see SEARCH result";
        System.out.println(sentence.endsWith("result"));// checks only the end od sentence
        System.out.println(sentence.contains("see"));// checks everywhere in the sentence
    }
}
