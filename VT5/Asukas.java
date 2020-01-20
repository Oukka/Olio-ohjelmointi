import java.util.*;
public class Asukas{
    private String nimi;
	private ArrayList<String> asukkaat;



	public Asukas(){
		asukkaat = new ArrayList<String>();
	}
	
    public Asukas(String nimi){
		asukkaat = new ArrayList<String>();
        this.nimi = nimi;
		asukkaat.add(nimi);
    }
	
	public void lisaaAsukas(String nimi){
	    this.nimi = nimi;
		asukkaat.add(nimi);
	}
    
    public void tulostaTiedot(){
		System.out.println("Rakennuksen asukkaat:  " + asukkaat);
    }
	
    public void setNimi(String nimi){
        this.nimi = nimi;
    }
	
    public void setAsukkaat(ArrayList<String> asukkaat){
        this.asukkaat = asukkaat;
    }
	
    public String getNimi(){
        return nimi;
    }
    public ArrayList<String> getAsukkaat(){
        return asukkaat;
    }
}
