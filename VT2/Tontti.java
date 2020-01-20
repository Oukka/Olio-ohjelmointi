public class Tontti{
    private String nimi;
    private String sijainti;
    private double pintaAla;

public Tontti(){
}

	public Tontti(String nimi, String sijainti, double pintaAla){
	this.nimi = nimi;
	this.sijainti = sijainti;
	this.pintaAla = pintaAla;
	}

    public void tulostaTiedot(){
        System.out.println();
        System.out.println("Tontin nimi:      " + nimi);
        System.out.println("Tontin sijainti:  " + sijainti);
        System.out.println("Tontin pinta-ala: " + pintaAla + " neliometria");
    }
    
    public void setNimi(String nimi){
        this.nimi = nimi;
    }

    public void setSijainti(String sijainti){
        this.sijainti = sijainti;
    }

    public void setPintaAla(double pintaAla){
        this.pintaAla = pintaAla;
    }

    public String getNimi(){
        return nimi;
    }

    public String getSijainti(){
        return sijainti;
    }

    public double getPintaAla(){
        return pintaAla;
    }
}
