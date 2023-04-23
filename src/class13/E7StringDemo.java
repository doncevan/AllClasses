package class13;

public class E7StringDemo {
    public static void main(String[] args) {
       String name="Marina";
       String name1="Abdul";
       String name2="Brett";
       String country="USA";  // "USA" will be stored in one memory space
       String country2="USA"; // this is not flexible, changes impact all instances
       String country3="USA";  // save space, but limits flexibility

       StringBuilder country4=new StringBuilder("USA");  // "USA" will be stored in three memory spaces
       StringBuilder country5=new StringBuilder("USA");  // this is flexible, changes won't impact all instances
       StringBuilder country6=new StringBuilder("USA");  // uses more space, but very flexible can manipulate each variable individually


    }
}
