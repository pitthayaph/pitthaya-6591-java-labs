package phuengsujarit.pitthaya.lab2 ;

/*The Patient Program 
 * The program accepts detail of patient 
 * and display patient informatiion
 * The output will show 
 * Patient's name 
 * Patient's age
 *  and Patient's gender
 * 
 * 
 * Author: Pitthaya Phuengsujarit
 * Student ID: 663040659-1
 * Sec : 2
 * 
 * Last update 
 * 11/24/2023 10.09pm
 */

 public class Patient {
    public static void main (String[]args){
        if (args.length !=3){
        System.err.println("Error: Invalid number of argument. Please provide exactly three arguments.");

               
        }else{
            System.out.println("Patient' Name : " + args[0] );
            System.err.println("Age : "+ args[1]);
            System.out.println("Gender : " + args[2]);
        }
    }

 }

