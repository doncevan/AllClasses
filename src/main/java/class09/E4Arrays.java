package class09;

public class E4Arrays {
    public static void main(String[] args) {
        String [] names={"Jacob", "Lean", "Pavel", "Ben", "Sam"};
            for (int i=0;i<names.length;i++){
                System.out.print(names[i]+" ");
            }
        System.out.println();
            int i=0;
            while (i<names.length){
                System.out.print(names[i]+" ");
                i++;
            }
    }
}
