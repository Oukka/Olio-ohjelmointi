public class Asukkaat{
    private String nimi;
    private String syntymaAika;
    private int asukasLkm;

public Asukkaat(){
  asukasLkm++;
}

	public Asukkaat(String nimi, String syntymaAika){
	this.nimi = nimi;
	this.syntymaAika = syntymaAika;
	}

    public void tulostaTiedot(){
        System.out.println();
        System.out.println("Asukas " + getNimi() + " on syntynyt " + getSyntymaAika());
    }

    public void setNimi(String nimi){
        this.nimi = nimi;
    }

    public void setSyntymaAika(String syntymaAika){
        this.syntymaAika = syntymaAika;
    }

    public void setAsukasLkm(int asukasLkm){
      this.asukasLkm = asukasLkm;
    }

    public String getNimi(){
        return nimi;
    }

    public String getSyntymaAika(){
        return syntymaAika;
    }

    public int getAsukasLkm(){
      return asukasLkm;
    }


}
