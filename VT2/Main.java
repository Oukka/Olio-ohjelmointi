import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{
    private static Scanner scan = new Scanner(System.in);
    
   public static void main(String [] args){
        Tontti tontti;
        Rakennus rakennus;
        Asukkaat asukkaat;
        
        tontti = lueTontti();
        rakennus = lueRakennus();
        asukkaat = lueAsukkaat(rakennus.getAsukasLkm());

        tontti.tulostaTiedot();
        rakennus.tulostaTiedot();
        asukkaat.tulostaTiedot(rakennus.getAsukasLkm());
    }

    public static Tontti lueTontti(){
        String nimi, sijainti;
        double pintaAla;
      
        System.out.print("Anna tontin nimi> ");
        nimi = scan.nextLine();

        System.out.print("Anna tontin koordinaatit muodossa XX.XXXN, XX.XXXE> ");
        sijainti = scan.nextLine();
        
         while (true){
            try {
                System.out.print("Anna tontin pinta-ala neliometreina> ");
                pintaAla = scan.nextDouble();
                scan.nextLine();
                break;
            }
            catch (InputMismatchException e){
                System.err.println("Please enter a number! ");
                scan.nextLine();
                continue;
            }
        }   

        
        Tontti tontti = new Tontti(nimi, sijainti, pintaAla);
        
        return tontti;
    }

    public static Rakennus lueRakennus(){
        double pintaAla;
        int huoneLkm, asukasLkm;
        while (true){
            try {
                System.out.print("Anna rakennuksen pinta-ala neliometreina> ");
                pintaAla = scan.nextDouble();
                scan.nextLine();
                break;
            }
            catch (InputMismatchException e){
                System.err.println("Please enter a number! ");
                scan.nextLine();
                continue;
            }
        }
        

        while (true){
            try {
                System.out.print("Anna huoneiden lukumaara> ");
                huoneLkm = scan.nextInt();
                scan.nextLine();
                break;
            }
            catch (InputMismatchException e){
                System.err.println("Please enter a number! ");
                scan.nextLine();
                continue;
            }
        }

        while (true){
            try {
                System.out.print("Anna asukkaiden lukumaara> ");
                asukasLkm = scan.nextInt();  
                scan.nextLine();
                break;
            }
            catch (InputMismatchException e){
                System.err.println("Please enter a number! ");
                scan.nextLine();
                continue;
            }
        }    
        Rakennus rakennus = new Rakennus(pintaAla, huoneLkm, asukasLkm);
        
        return rakennus;
        }



    public static Asukkaat lueAsukkaat(int lkm){
        String nimilista[] = new String[lkm];
        String syntymaAikaLista[] = new String[lkm];
        
        for (int asukas=0; asukas<lkm; asukas++){ 
            System.out.print("Anna asukkaan " + (asukas+1) + " nimi> ");
            nimilista[asukas] = scan.nextLine();
            System.out.print("Anna asukkaan " + (asukas+1) + " syntyma-aika> ");
            syntymaAikaLista[asukas] = scan.nextLine();
                
        }
        Asukkaat asukkaat  = new Asukkaat(nimilista, syntymaAikaLista);  
        return asukkaat;
    }
}



