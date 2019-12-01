import java.util.Scanner;
import java.util.InputMismatchException;

public class PankkitiliMain{

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        double saldo, otto, talletus;
        int toiminto;
        String tilinOmistaja, tilinumero;

        System.out.print("Anna tilin omistaja> ");
        tilinOmistaja = input.nextLine();

        System.out.print("Anna tilinumero> ");
        tilinumero = input.nextLine();

        while(true){
          try{
            System.out.print("Anna tilin saldo> ");
            saldo = input.nextDouble();
            if (saldo>=0){
              break;
            }
            else {
              System.out.print("Saldon on oltava vahintaan 0.");
              System.out.println();
              continue;
            }
          }
          catch (InputMismatchException e){
              System.err.println("Syota numero!");
              input.nextLine();
              continue;
          }
        }
        saldo = Math.round(saldo*100.0)/100.0;

        Pankkitili tili = new Pankkitili(tilinOmistaja, tilinumero, saldo);
        do{
            tulostaValikko();
            toiminto = input.nextInt();
            System.out.println();

            if (toiminto == 1){
                tili.tulostaTiedot();
            }
            if (toiminto == 2){
              while(true){
                try{
                  System.out.print("Syota nostettava rahasumma> ");
                  otto = input.nextDouble();
                  if (otto>=0.01){
                    break;
                  }
                  else {
                    System.out.print("Pienin sallittu nosto on 0,01e.");
                    System.out.println();
                    continue;
                  }
                }
                catch (InputMismatchException e){
                    System.err.println("Syota numero!");
                    input.nextLine();
                    continue;
                }
              }

                otto = Math.round(otto*100.0)/100.0;
                tili.nostaRahaa(otto);
            }
            if (toiminto == 3){
              while(true){
                try{
                  System.out.print("Syota talletettava rahasumma> ");
                  talletus = input.nextDouble();
                  if (talletus>=0.01){
                    break;
                  }
                  else {
                    System.out.print("Talletuksen on oltava vahintaan 0,01e.");
                    System.out.println();
                    continue;
                  }
                }
                catch (InputMismatchException e){
                    System.err.println("Syota numero!");
                    input.nextLine();
                    continue;
                }
              }

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
