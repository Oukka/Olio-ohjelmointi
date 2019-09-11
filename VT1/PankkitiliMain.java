import java.util.Scanner;

public class PankkitiliMain{
  
    public static void main(String [] args){      
 
        Scanner input = new Scanner(System.in);

        double saldo, otto, talletus;
        int toiminto, tilin_omistaja, tilinro;   
        
        System.out.print("Anna tilin omistaja> ");
        tilin_omistaja = input.nextLine();
        System.out.print("Anna tilinumero> ");
        tilinro = input.nextLine();
        do{
        System.out.print("Anna tilin saldo> ");
        saldo = input.nextDouble();
        } while(saldo<0);
        saldo = Math.round(saldo*100.0)/100.0;        
        tili.setSaldo(saldo);
        Pankkitili tili = new Pankkitili(tilin_omistaja, tilinro, saldo);        
        do{
            tulostaValikko();
            toiminto = input.nextInt();
            System.out.println();  
            
            if (toiminto == 1){
                tili.tulostaTiedot();
            }
            if (toiminto == 2){
                System.out.print("Syota nostettava rahasumma> ");
                otto = input.nextDouble();
                otto = Math.round(otto*100.0)/100.0; 
                tili.nostaRahaa(otto);
            }
            if (toiminto == 3){
                System.out.println();        
                System.out.print("Syota talletettava rahasumma> ");
                talletus = input.nextDouble();
                talletus = Math.round(talletus*100.0)/100.0; 
                tili.talletaRahaa(talletus);
            }
            if (toiminto == 4){
                break;
            }
        } while (toiminto != 4);
       
    }
    public static void tulostaValikko(){
    System.out.println();
    System.out.println("Anna toiminnon numero");
    System.out.println("1 Tilin tiedot");
    System.out.println("2 Otto");
    System.out.println("3 Talletus");
    System.out.println("4 Poistu");
    System.out.print("> ");
    }
    
}