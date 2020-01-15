import java.util.ArrayList;

public class Rakennus{
    protected String tyyppi;
    protected int asuntoLkm, huoneLkm, pintaAla;
    protected ArrayList<Double> aPintaAlat;
    protected ArrayList<Asukas> asukkaat;

    public Rakennus() {
    }

	public Rakennus(String tyyppi, int asuntoLkm, int huoneLkm, ArrayList<Double> aPintaAlat, ArrayList<Asukas> asukkaat){
    this.tyyppi = tyyppi;
	this.asuntoLkm = asuntoLkm;
    this.huoneLkm = huoneLkm;
    this.aPintaAlat = aPintaAlat;
    this.asukkaat = asukkaat;
	
	}
	
	public Rakennus(int huoneLkm, ArrayList<Double> aPintaAlat, ArrayList<Asukas> asukkaat){
    this.asuntoLkm = asuntoLkm;
    this.huoneLkm = huoneLkm;
    this.aPintaAlat = aPintaAlat;
    this.asukkaat = asukkaat;
	}

    public class Kerrostalo extends Rakennus{
        public Kerrostalo(String tyyppi, int asuntoLkm, int huoneLkm, ArrayList<Double> aPintaAlat, ArrayList<Asukas> Asukkaat){
			super();
			this.tyyppi = tyyppi;
			this.asuntoLkm = asuntoLkm;
			this.huoneLkm = huoneLkm;
			this.aPintaAlat = aPintaAlat;
			this.asukkaat = asukkaat;
		}
    }
    public class Rivitalo extends Rakennus{
        public Rivitalo(String tyyppi, int asuntoLkm, int huoneLkm, ArrayList<Double> aPintaAlat, ArrayList<Asukas> Asukkaat){
			super();
			this.tyyppi = tyyppi;
			this.asuntoLkm = asuntoLkm;
			this.huoneLkm = huoneLkm;
			this.aPintaAlat = aPintaAlat;
			this.asukkaat = asukkaat;
		}
	}
    public class Omakotitalo extends Rakennus{
        public Omakotitalo(String tyyppi, int huoneLkm, ArrayList<Double> aPintaAlat, ArrayList<Asukas> Asukkaat){
			super();
			this.tyyppi = tyyppi;
			this.huoneLkm = huoneLkm;
			this.aPintaAlat = aPintaAlat;
			this.asukkaat = asukkaat;
		}
	}

    public class Asunto extends Rakennus{
        Asunto(int huoneLkm, int pintaAla, ArrayList<Asukas> Asukkaat){
        }
    }
	
    public void tulostaTiedot(){
        System.out.println();
        System.out.println("Rakennuksen tyyppi:    " + tyyppi);
        System.out.println("Asuntojen lukumaara:   " + asuntoLkm);
        System.out.println("Huoneiden lukumaara:   " + huoneLkm);
        System.out.println("Asuntojen pinta-alat:  " + aPintaAlat);
        System.out.println("Rakennuksen asukkaat:  " + asukkaat);
	}
		
    // public void tulostaTiedot(){
        // System.out.println();
        // System.out.println("Rakennuksen tyyppi:    " + getTyyppi());
        // System.out.println("Asuntojen lukumaara:   " + getAsuntoLkm());
        // System.out.println("Huoneiden lukumaara:   " + getHuoneLkm() + " kpl");
        // System.out.println("Asuntojen pinta-alat:  " + getaPintaAlat() + " neliometria");
        // System.out.println("Rakennuksen asukkaat:  " + getAsukkaat());
        // }

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

    public void setAsukkaat(ArrayList<Asukas> asukkaat){
        this.asukkaat = asukkaat;
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

    public ArrayList<Asukas> getAsukkaat(){
        return asukkaat;
    }
}
