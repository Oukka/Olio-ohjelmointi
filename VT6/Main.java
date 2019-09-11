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
        String filename = null;
        
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
        wordlist.printWords();
        
       
    }
}
