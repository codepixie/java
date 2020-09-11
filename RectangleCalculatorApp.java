/*Author: Crystal Ekker
 *
 * Purpose: application that calculates the area and perimeter of a rectangle.
 */
package rectanglecalculatorapp;

/**
 *
 * @author crystal
 */
import java.util.Scanner;

public class RectangleCalculatorApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to the Area and Perimeter Calculator");
        System.out.println(); //print blank line
        
        //create the Scanner object
  
        Scanner sc = new Scanner(System.in);
     
     //perform rectangle calculations until choice isn't equal to "y" or "Y"   
     String choice ="y";   
     while (choice.equalsIgnoreCase("y")) {
         
     
     //get the measurements from the user
        System.out.println("Enter the length: ");
        double length = sc.nextDouble();
        System.out.println("Enter the width:");
        double width = sc.nextDouble();
        
        //calculate the rectangle
        double area = length * width;
        double perimeter = 2 * length + 2 * width;
        
        //display the results
        String message = "area: " + area + "\n" + "perimeter: "
                + perimeter;
        System.out.println(message);
        
        //See if the user wants to continue
        System.out.println("Continue? y/n: ");
        choice = sc.next();
        System.out.println();
             
        
    }
    
}
}