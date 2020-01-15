public class Asukas{
    private String nimi;

    public Asukas(String nimi){
        this.nimi = nimi;
    }
    
    public void tulostaTiedot(){
        System.out.print(nimi);
    }

    public void setNimi(String nimi){
        this.nimi = nimi;
    }

    public String getNimi(){
        return nimi;
    }

}
