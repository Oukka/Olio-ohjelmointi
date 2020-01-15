public class Tontti{
    private String nimi, osoite;
    private double pintaAla;
   
    public Tontti(){
    }
    
	public Tontti(String nimi, String osoite, double pintaAla){
	this.nimi = nimi;
	this.osoite = osoite;
	this.pintaAla = pintaAla;
	}

    public void tulostaTiedot(){
        System.out.println();
        System.out.println("Tontin nimi:      " + nimi);
        System.out.println("Tontin osoite:    " + osoite);
        System.out.println("Tontin pinta-ala: " + pintaAla + " neliometria");
    }
    
    public void setNimi(String nimi){
        this.nimi = nimi;
    }

    public void setOsoite(String osoite){
        this.osoite = osoite;
    }

    public void setPintaAla(double pintaAla){
        this.pintaAla = pintaAla;
    }

    public String getNimi(){
        return nimi;
    }

    public String getOsoite(){
        return osoite;
    }

    public double getPintaAla(){
        return pintaAla;
    }
}
