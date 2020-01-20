import java.util.*;
import java.io.File;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.io.IOException;

public class Main{
    private static Scanner scan = new Scanner(System.in);
    
    public static void main(String [] args){
        String filename = "";
		char letter, choice;
		int numberOfGuesses;
		
		System.out.println("Welcome to hangman! ");
        
        while (true){
            System.out.print("Enter filename containing words> ");
            filename = scan.nextLine();
            File f = new File(filename);
            if (f.exists()){
                 break;
            }
            else{
                System.out.println("File not found");
            }
        }
        Wordlist wordlist = new Wordlist(filename);              
			    
/* 		while (true){
			try {
				System.out.print("How many guesses would you like to have? (from 5 to 10)> ");
				numberOfGuesses  = scan.nextInt();
				scan.nextLine();
				if (numberOfGuesses>=5 && numberOfGuesses <= 10){
					break;
				} else{
					continue;
				}
			}
			catch (InputMismatchException e){
				System.err.println("Enter a number! ");
				scan.nextLine();
				continue;
				}
			} */ 
		
		
		//Playing the game
		while (true){
			Hangman hangman = new Hangman(wordlist.returnWords());
			while (true){
				System.out.println();
				System.out.println("You have guessed letters: " + hangman.getGuesses());
				System.out.println("Wrong guesses left: " + hangman.getGuessesLeft());
				System.out.print("Guess a letter!> ");
				char c = scan.next().charAt(0);
				c = Character.toLowerCase(c);
				if(hangman.guessChar(c)){
					hangman.fillHangman(c);
				} else{
					System.out.println("'" + c + "'" + " is not in the hangman word");
				}
				System.out.println();
				hangman.printHiddenWord();
				System.out.println();
				
				if (hangman.gameEnded()){
					break;
				} else{
					continue;
				}
			}
			while (true){
				System.out.print("Would you like a new game? y/n> ");
				choice = scan.next().charAt(0);
				if ( choice == 'y'){
					break;
				}
				else if (choice == 'n'){
					System.exit(0);
				} else{
					continue;
				}
			}
		}
		
	}	
}
