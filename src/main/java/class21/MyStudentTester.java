package class21;

public class MyStudentTester {
    public static void main(String[] args) {

        MyStudent myStudent[] = {new SyntaxMyStudent(), new CollegeMyStudent(), new SchoolMyStudent()};
        for (MyStudent friends : myStudent) {

            friends.learn();
            //friends.learnJava(); check below for down-casting example
            friends.speak();
            //friends.drive();  check below for down-casting example
            friends.speak();
            friends.learn();

            // friends.play();  check below for down-casting example
            friends.learn();
            friends.sleep();
        }

        MyStudent myStudent1 = new SyntaxMyStudent();  // these are examples of down-casting or narrowing
        SyntaxMyStudent SS = (SyntaxMyStudent) myStudent1;
        SS.learnJava();

        MyStudent myStudent2 = new CollegeMyStudent();
        CollegeMyStudent CS = (CollegeMyStudent) myStudent2;
        CS.drive();

        MyStudent myStudent3 = new SchoolMyStudent();
        SchoolMyStudent SchS = (SchoolMyStudent) myStudent3;
        SchS.play();
        SchS.sleep();
    }
}