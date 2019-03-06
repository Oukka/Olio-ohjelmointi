//Printing a greeting
//Asking user to input surname and first names divided by spaces
//Printing "Welcome to the world of Java-coding" + users name
//Waiting until user presses enter/return which causes the end of the program and return to the OS

import java.util.Scanner; //input lukeminen

public class Welcome {
    public static void main(String [] args){
        
        Scanner keyboard = new Scanner(System.in);
        
        String name;
        
        System.out.print("Give your surname and first names separated by empty spaces>")