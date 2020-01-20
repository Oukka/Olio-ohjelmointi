import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Wordlist{
    private List<String> list = new ArrayList<String>();
    private int listSize, wordLength;
	

    public Wordlist(String fileName){
        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {
            String word;
            while ((word = br.readLine()) != null) {
                list.add(word);
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        listSize = list.size();
    }
    

	
    public List<String> returnWords(){
        return list;
    }
    
    public void setListSize(int size){
        this.listSize = size;
        }
        
    public int getListSize(){
        return listSize;
    }
    
    public void printWords(){
        for (int i=0; i<listSize; i++){
            System.out.println(list.get(i));
        }
    }

}
