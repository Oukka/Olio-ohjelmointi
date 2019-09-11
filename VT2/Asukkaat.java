public class Asukkaat{
    private String nimet[];
    private String syntymaAjat[];

    public Asukkaat(String nimet[], String syntymaAjat[]){
        this.nimet = nimet;
        this.syntymaAjat = syntymaAjat;
    }
    
    public Asukkaat(int lkm){
    String nimet[] = new String[lkm];
    String syntymaAjat[] = new String[lkm];
    }
    
    public void tulostaTiedot(int lkm){
        System.out.println();
        for (int i=0; i<lkm; i++)  
            System.out.println("Asukas " + nimet[i] + " on syntynyt " + syntymaAjat[i]);
    }

    public void setNimet(String nimet[]){
        this.nimet = nimet;
    }

    public void setSyntymaAjat(String syntymaAjat[]){
        this.syntymaAjat = syntymaAjat;
    }

    public String[] getNimet(){
        return nimet;
    }

    public String[] getSyntymaAjat(){
        return syntymaAjat;
    }
}
