/* Author: Crystal Ekker
 * September 11, 2020
 * 
 * Purpose: Create an application that allows a student to enter registration
 * information. This should display a completion that includes the user's full name
 * and a temporary password.
 * 
 */
package studentregistration;

import java.util.Scanner;

public class StudentRegistration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Student Registration Form ");
        System.out.println(); //print a blank line
        
        //initialize variables and create a scanner Object
        String firstName;
        firstName = "";
        String lastName;
        lastName = "";
        int yearOfbirth = 0;
        Scanner sc = new Scanner(System.in);
        
        
        //Get the student information
        System.out.println("Enter first name: ");
        firstName = sc.next();
        System.out.println("Enter last name: ");
        lastName = sc.next();
        System.out.println("Enter year of birth ");
        yearOfbirth = sc.nextInt();
        System.out.println("Welcome " + firstName + " " + lastName +"!");
        System.out.println("Your registration is complete.");
        System.out.println("Your temporary password is: " + firstName + "*" + yearOfbirth);
        
        
    
    }

    private static class string {

        public string() {
        }
    }
    
}
