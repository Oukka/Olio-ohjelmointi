import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Arrays; 

public class Hangman{
    private String hangmanWord;
	private ArrayList<Character> hiddenWord;
    private List<Character> guessList = new ArrayList<Character>();
    private int guessesLeft;
    
    
    public Hangman(List<String> words){
		guessesLeft = 6;
        Random rand = new Random();
        hangmanWord = words.get(rand.nextInt(words.size()));
		hangmanWord = hangmanWord.toLowerCase();
		
		hiddenWord = new ArrayList<Character>();
		for (int i=0; i < hangmanWord.length(); i++) {
			hiddenWord.add('_');
		}
		System.out.println();
		printHiddenWord();
		System.out.println();
	}
    
    public boolean guessChar(Character c){


		guessList.add(c);
        int index = hangmanWord.indexOf(c);
        if(index >= 0){
            return true;
        } else {
			guessesLeft-=1;
            return false;
        }  
    }

    public void fillHangman(Character c){
        int index = hangmanWord.indexOf(c); 
        while (index >= 0) {
			//System.out.println("Arvauksen indeksi: " + index);
			hiddenWord.set(index,c);
			index = hangmanWord.indexOf(c, index + 1);
        } 
		//printHiddenWord();
    }    
    
     public boolean gameEnded(){
        if (guessesLeft==0){
			System.out.println("No guesses left! You lost! ");
            return true;
        }
        if (hiddenWord.indexOf('_') < 0){
			System.out.println("You won the game! ");
        return true;
        } else{
            return false;
        }
    } 
	public void printHiddenWord(){
		String formattedWord = hiddenWord.toString()
			.replace(",", "")  //remove the commas
			.replace("[", "")  //remove the right bracket
			.replace("]", "")  //remove the left bracket
			.trim();           //remove trailing spaces from partially initialized arrays
		System.out.println(" " + formattedWord);
	}
	
	public void setGuesses(List<Character> guessList){
		this.guessList = guessList;
	}
	
	public void setGuessesLeft(int guessesLeft){
		this.guessesLeft = guessesLeft;
	}
	
	public void setWord(String word){
		this.hangmanWord = word;
	}
    public List<Character> getGuesses(){
        return guessList;
    }

    public int getGuessesLeft(){
       return guessesLeft;
    }
    
    public String getWord(){
        return hangmanWord;
    }

}
