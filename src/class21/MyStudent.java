package class21;

public class MyStudent {

    void learn() {System.out.println("Student Learning");}

    void speak() {System.out.println("Student Speaking");}

    void sleep() {System.out.println("Student Sleeping");}
}

class SyntaxMyStudent extends MyStudent {
    @Override
    void learn() {System.out.println("SyntaxStudent Learning");}

    @Override
    void speak() {System.out.println("SyntaxStudent Speaking");}

    void learnJava() {System.out.println("SyntaxStudent Learning Java");}
}

class CollegeMyStudent extends MyStudent {
    @Override
    void speak() {System.out.println("CollegeStudent Speaking");}

    @Override
    void sleep() {System.out.println("CollegeStudent Sleeping");}

    void drive() {System.out.println("CollegeStudent Driving");}
}

class SchoolMyStudent extends MyStudent {
    @Override
    void sleep() {System.out.println("SchoolStudent Sleeping");}

    void play() {System.out.println("SchoolStudent Playing");}
}
