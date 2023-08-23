package class17;

public class Auto {
/*Write a java class that will have a constructor: one with parameters and second without any parameters.
 Create a separate zeroSumArrayTest class where you will execute both of the constructors 1 by 1.
 */
    String make;
    String color;
    Auto(String carMake, String carColor){
        make=carMake;
        color=carColor;
        System.out.println("Parametered");
    }
    Auto(){
        System.out.println("Non argument");
    }
}
