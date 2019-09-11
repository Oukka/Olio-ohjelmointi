public class Hangman{
    private String hangmanWord;
    private List<Character> guesslist = new ArrayList<Character>();
    private int guessesLeft;
    
    
    public Hangman(Wordlist words, int guesses){
        this.guessesLeft = guesses;
        Random rand = new Random();
        String hangmanWord = words.get(rand.nextInt(Wordlist.size()));
    }
    
    public boolean guessChar(Character c){
        int index = hangmanWord.indexOf(c);
        if(index >= 0){
            return true;
        } else {
            return false;
        }  
    }

    //print index(s) of char in word
    public void printCharIndex(Character c){
        guesslist.add(c);
        int index = hangmanWord.indexOf(c); 
        while (index >= 0) {
        System.out.println(index);
        index = word.indexOf(guess, index + 1);
        } 
    }        

    public List<Character> guesses(){
        return guesslist;
    }

    public int guessesLeft(){
       return guessesLeft;
    }
    
    public String word(){
        return hangmanWord;
    }
    public boolean isEnded(){
        if (guessesLeft.equals(0)){
            return true;
        }
        if (){ 
        
        return true;
        } else{
            return false;
        }
    }
}
