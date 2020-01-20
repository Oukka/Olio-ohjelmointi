import java.util.ArrayList;

public class Rakennus{
    protected String tyyppi;
    protected int asuntoLkm, huoneLkm, pintaAla, asukasLkm;
    protected ArrayList<Double> aPintaAlat;

    public Rakennus() {
    }

	public Rakennus(String tyyppi, int asuntoLkm, int huoneLkm, ArrayList<Double> aPintaAlat, int asukasLkm){
    this.tyyppi = tyyppi;
	this.asuntoLkm = asuntoLkm;
    this.huoneLkm = huoneLkm;
    this.aPintaAlat = aPintaAlat;
	this.asukasLkm = asukasLkm;
	}
	

    public class Kerrostalo extends Rakennus{
        public Kerrostalo(String tyyppi, int asuntoLkm, int huoneLkm, ArrayList<Double> aPintaAlat, int asukasLkm){
			super();
			this.tyyppi = tyyppi;
			this.asuntoLkm = asuntoLkm;
			this.huoneLkm = huoneLkm;
			this.aPintaAlat = aPintaAlat;
			this.asukasLkm = asukasLkm;
		}
    }
    public class Rivitalo extends Rakennus{
        public Rivitalo(String tyyppi, int asuntoLkm, int huoneLkm, ArrayList<Double> aPintaAlat, int asukasLkm){
			super();
			this.tyyppi = tyyppi;
			this.asuntoLkm = asuntoLkm;
			this.huoneLkm = huoneLkm;
			this.aPintaAlat = aPintaAlat;
			this.asukasLkm = asukasLkm;
		}
	}
    public class Omakotitalo extends Rakennus{
        public Omakotitalo(String tyyppi, int asuntoLkm, int huoneLkm, ArrayList<Double> aPintaAlat, int asukasLkm){
			super();
			this.tyyppi = tyyppi;
			this.asuntoLkm = asuntoLkm;
			this.huoneLkm = huoneLkm;
			this.aPintaAlat = aPintaAlat;
			this.asukasLkm = asukasLkm;
		}
	}
	
    public void tulostaTiedot(){
        System.out.println();
        System.out.println("Rakennuksen tyyppi:    " + tyyppi);
        System.out.println("Asuntojen lukumaara:   " + asuntoLkm);
        System.out.println("Huoneiden lukumaara:   " + huoneLkm);
        System.out.println("Asuntojen pinta-alat:  " + aPintaAlat);
		System.out.println("Asukkaiden lukumaara:  " + asukasLkm);
	}


    public void setTyyppi(String tyyppi){
        this.tyyppi = tyyppi;
    }

    public void setAsuntoLkm(int asuntoLkm){
        this.asuntoLkm = asuntoLkm;
    }

    public void setHuoneLkm(int huoneLkm){
        this.huoneLkm = huoneLkm;
    }

    public void setaPintaAlat(ArrayList<Double> aPintaAlat){
        this.aPintaAlat = aPintaAlat;
    }
	
	public void setAsukasLkm(int asukasLkm){
        this.asukasLkm = asukasLkm;
    }


    public String getTyyppi(){
        return tyyppi;
    }
    public int getAsuntoLkm(){
        return asuntoLkm;
    }
    public int getHuoneLkm(){
        return huoneLkm;
    }

    public ArrayList<Double> getaPintaAlat(){
        return aPintaAlat;
    }
	public int getAsukasLkm(){
        return asukasLkm;
    }

}
