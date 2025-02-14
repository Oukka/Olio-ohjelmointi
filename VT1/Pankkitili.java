/*Kaytetaan pankkitilin tietojen asetukseen ja tulostamiseen*/

public class Pankkitili{
    private String tilinOmistaja;
    private String tilinumero;
    private double saldo;
    private double otto;
    private double talletus;

	public Pankkitili() {
	}

	public Pankkitili(String tilinOmistaja, String tilinumero, double saldo) {
    this.tilinOmistaja = tilinOmistaja;
    this.tilinumero = tilinumero;
    this.saldo = saldo;
	}

    public void nostaRahaa(double otto) {
        if (saldo < otto){
            System.out.println("Tililla ei ole tarpeeksi varoja.");
            return;
        }
        else {
            saldo -= otto;
            System.out.printf("Tililta nostettu %.2f euroa.", (otto));
            System.out.println();
        }
    }

    public void talletaRahaa(double talletus) {
        saldo += talletus;
        System.out.printf("Tilille talletettu %.2f euroa.", talletus);
        System.out.println();
        }

    public void tulostaTiedot(){
        System.out.println();
        System.out.println("Tilin omistaja: " + tilinOmistaja);
        System.out.println("Tilinumero: " + tilinumero);
        System.out.printf("Tilin saldo: %.2f euroa", saldo);
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
