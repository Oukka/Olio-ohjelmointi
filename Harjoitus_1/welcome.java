

//Printing a greeting
//Asking user to input surname and first names divided by spaces
//Printing "Welcome to the world of Java-coding" + users name
//Waiting until user presses enter/return which causes the end of the program and return to the OS

//import java.util.Scanner; //input lukeminen
import java.io.Console; //yksittäisten rivien lukeminen

public class Welcome {
     
	public static void main(String args[]){
        String fullName = console.readLine();       
        private static final Console console  = System.console(); 
        System.out.println("Hello program user!");
        System.out.println("Please type in your surname and first names >");

        System.out.printf("Welcome to the world of Java-coding %s. %n", fullName);
        while (true) {
            String emptyString = console.readLine();
            // System.out.printf("%s%n", emptyString);

            if(emptyString.length() == 0){
                break;
                } 
            }
        System.exit(0);
        }
    }