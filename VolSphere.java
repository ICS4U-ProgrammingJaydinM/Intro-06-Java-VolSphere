/**
 * The MathOperators program can do addition, subtraction, multiplication, division, exponents and
 * square root.
 *
 * @author Jaydin Madore
 * @version 1.0
 * @since 2023-02-20
 */

 import java.util.Scanner;

 public final class VolSphere {

   public static void main(String[] args) {

    Scanner userinput = new Scanner(System.in);

    System.out.println(" Enter the radius of a sphere that is positive and is not 0:");
    float radius = userinput.nextFloat();
    
    if (radius <= 0) {
        System.out.println("You can not enter zero or a negative number");
    }
    else {
        final Double firstCal = (4.0f / 3.0f) * Math.PI;
        final Double Volume = firstCal * Math.pow(radius, 3);
        // Outputs the Volume to Console.
        double VolumeRounded = Math.round(Volume * 100) / 100.000;
        System.out.println("Your Volume is: " + VolumeRounded + " cm^3 (U^3)");
    }
    
    
  }
}