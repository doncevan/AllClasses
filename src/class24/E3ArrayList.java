package class24;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {
        ArrayList<Character> characters = new ArrayList<>();
        characters.add('D');
        characters.add('E');
        characters.add('W');
        System.out.println(characters);
        System.out.println(characters.indexOf('E'));
        System.out.println(characters.contains('W'));
        System.out.println(characters.isEmpty());
        System.out.println(characters.set(1, 'H')); // replaces the character at specified index
        System.out.println(characters);

    }
}
