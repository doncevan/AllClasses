package class11;

public class E2D2Array {
    public static void main(String[] args) {
        String[][] names2DArray = {{"Sarah", "Artem", "Lean", "Semir"},
                {"Farwa", "Halima", "Alina", "Daniel"}
        };
        for (String[] name1DArray : names2DArray) {
            for (String name : name1DArray) {
                System.out.print(name + " ");
            }
            System.out.println();
        }

        }
    }
