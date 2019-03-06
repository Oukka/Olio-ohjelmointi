//Kaytetaan pankkitilin tietojen asetukseen ja tulostamiseen

public class Pankkitili{
    private String tilinOmistaja;
    private String tilinumero;
    private double saldo;
    private double otto;
    private double talletus;
    
	public Pankkitili() {
	}
	
	public Pankkitili(String tilinOmistaja, String tilinumero, double saldo) {		
	}
	
    public void nostaRahaa(double otto) {
        if (saldo < otto){
            System.out.println("Tililla ei tarpeeksi varoja.");
            return;
        }
        if (otto < 0) {
            System.out.println("Tililta ei voi nostaa negatiivista summaa.");
            return;
        }
        if (otto == 0) {
            System.out.println("Pienin nostettava summa on 0,01 euroa. ");
        }
        else {
            saldo -= otto;
            System.out.printf("Tililta nostettu %.2f euroa.", (otto)); 
            System.out.println();
        }
    }
    
    public void talletaRahaa(double talletus) {
        if (talletus < 0) {
            System.out.println("Tilille ei voi tallettaa negatiivista summaa.");
            return;
        }
        if (talletus == 0) {
            System.out.println("Pienin talletettava summa on 0,01 euroa.");
            return;
        }else {
        saldo += talletus;}
        System.out.printf("Tilille talletettu %.2f euroa.", talletus);   
        System.out.println();        
    }
    
    public void tulostaTiedot(){
        System.out.println();
        System.out.println("Tilin omistaja: " + getOmistaja());
        System.out.println("Tilinumero: " + getNumero());
        System.out.printf("Tilin saldo: %.2f euroa", getSaldo());
        System.out.println();        
    }
 
    
    public String getOmistaja(){
        return tilinOmistaja;
    }
    
    public String getNumero(){
        return tilinumero;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setOmistaja(String tilinOmistaja){
        this.tilinOmistaja = tilinOmistaja;
    }
    
    public void setNumero(String tilinumero){
        this.tilinumero = tilinumero;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}