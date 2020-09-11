/* Author: Crystal Ekker
 * September 11, 2020
 * 
 * Purpose: an application that converts number grades to letter grades.
 * 
 */
package gradeconverterapp;

/**
 *
 * @author crystal
 */
import java.util.Scanner;

public class GradeConverterApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to the Letter Grade Converter");
        System.out.println(); //print blank line
        
        //Perform grade calculations until choice isn't equal to "y" or "Y"
        int grade = 0;
        String letterGrade;
        letterGrade = "";
        
        Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")){
            //get the grade from the user
            System.out.println("Enter numerical grade: ");
            grade = sc.nextInt();
            
            //get the letter grade
            if (grade >= 88){
                letterGrade = ("A");
            } else if (grade >= 80) {
                letterGrade = ("B");
            } else if (grade>= 67){
                letterGrade = ("C");
            } else if (grade >= 60){
                letterGrade = ("D");
            } else if (grade < 60) {
                letterGrade = ("F");
            }
            
            System.out.println("" + letterGrade);
            
            
            //see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        
        
        
    }
 }
   
    

