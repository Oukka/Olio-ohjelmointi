public class Rakennus{
    private double pintaAla;
    private int huoneLkm;
    private int asukasLkm;

public Rakennus() {
}

	public Rakennus(double pintaAla, int huoneLkm, int asukasLkm){
	this.pintaAla = pintaAla;
	this.huoneLkm = huoneLkm;
	this.asukasLkm = asukasLkm;
	}

    public void tulostaTiedot(){
        System.out.println();
        System.out.println("Rakennuksen pinta-ala: " + pintaAla + " neliometria");
        System.out.println("Huoneitten lukumaara:  " + huoneLkm + " kpl");
        System.out.println("Asukkaitten lukumaara: " + asukasLkm + " kpl");
        }

    public void setPintaAla(double pintaAla){
        this.pintaAla = pintaAla;
    }

    public void setHuoneLkm(int huoneLkm){
        this.huoneLkm = huoneLkm;
    }

    public void setAsukasLkm(int asukasLkm){
        this.asukasLkm = asukasLkm;
    }

    public double getPintaAla(){
        return pintaAla;
    }

    public int getHuoneLkm(){
        return huoneLkm;
    }

    public int getAsukasLkm(){
        return asukasLkm;
    }
}
