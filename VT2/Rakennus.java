public class Rakennus{
    private float pintaAla;
    private int huoneLkm;
    private int asukasLkm;

public Rakennus() {
}

	public Rakennus(float pintaAla, int huoneLkm, int asukasLkm){
	this.pintaAla = pintaAla;
	this.huoneLkm = huoneLkm;
	this.asukasLkm = asukasLkm;
	}

    public void tulostaTiedot(){
        System.out.println();
        System.out.println("Rakennuksen pinta-ala: " + getPintaAla());
        System.out.println("Huoneitten lukumaara: " + getHuoneLkm());
        System.out.println("Asukkaitten lukumaara: " + getAsukasLkm());
        }

    public void setPintaAla(float pintaAla){
        this.pintaAla = pintaAla;
    }

    public void setHuoneLkm(int huoneLkm){
        this.huoneLkm = huoneLkm;
    }

    public void setAsukasLkm(int asukasLkm){
        this.asukasLkm = asukasLkm;
    }

    public float getPintaAla(){
        return pintaAla;
    }

    public int getHuoneLkm(){
        return huoneLkm;
    }

    public int getAsukasLkm(){
        return asukasLkm;
    }
}
