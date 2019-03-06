import java.util.Scanner;

public class Main{
    private static Scanner scan = new Scanner(System.in);
    private static Scanner scanNumbers = new Scanner(System.in);
    public static int lkm = 0;  
    
   public static void main(String [] args){

        Asukkaat [][] asukastiedot = null;

        
        lueTontti();
        lueRakennus();    
        lkm = rakennus.getAsukasLkm();
        asukastiedot = new Asukkaat[lkm][1];
        lueAsukkaat(asukastiedot);

        tontti.tulostaTiedot();
        rakennus.tulostaTiedot();
        for( int i=0; i < asukastiedot.length; i++ ){
         asukastiedot[i].tulostaTiedot();
        }
    }

    public static void lueTontti(){
      Tontti tontti = new Tontti();

      System.out.print("Anna tontin nimi> ");
      tontti.setNimi(scan.nextLine());

      System.out.print("Anna tontin koordinaatit muodossa XX.XXXN, XX.XXXE> ");
      tontti.setSijainti(scan.nextLine());

      System.out.print("Anna tontin pinta-ala neliometreina> ");
      tontti.setPintaAla(scanNumbers.nextFloat());
    }

    public static void lueRakennus(){
      Rakennus rakennus = new Rakennus();

      System.out.print("Anna rakennuksen pinta-ala neliometreina> ");
      rakennus.setPintaAla(scanNumbers.nextFloat());

      System.out.print("Anna huoneiden lukumaara> ");
      rakennus.setHuoneLkm(scanNumbers.nextInt());

      System.out.print("Anna asukkaiden lukumaara> ");
      rakennus.setAsukasLkm(scanNumbers.nextInt());

    }

    public static void lueAsukkaat(Asukkaat [][] asukastiedot){
      for(int i=0; i<=lkm; i++){
      System.out.printf("Anna asukkaan numero %d nimi> ", i+1);
      asukastiedot[i][0].setNimi(scan.nextLine());

      System.out.printf("Anna asukkaan %s syntyma-aika> ", asukastiedot[i].getNimi());
      asukastiedot[i][1].setSyntymaAika(scan.nextLine());
      }
    }

}
