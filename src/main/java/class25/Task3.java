package class25;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.LinkedHashSet;

public class Task3 {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Boston");
        linkedHashSet.add("New-York");
        linkedHashSet.add("Athens");
        linkedHashSet.add("Berlin");
        linkedHashSet.add("Rome");
        linkedHashSet.add("Madrid");
        linkedHashSet.add("Dallas");
        linkedHashSet.add("Atlanta");
        System.out.println(linkedHashSet);
        linkedHashSet.removeIf(x -> x.startsWith("A"));
        System.out.println(linkedHashSet);
        XSSFWorkbook xssfWorkbook;


    }
}
