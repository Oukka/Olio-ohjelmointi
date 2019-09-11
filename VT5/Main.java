import java.util.*;

public class Main{
    private static Scanner scan = new Scanner(System.in);
    
    public static void main(String [] args){
        Tontti tontti;
        Rakennus rakennus;
        Asukas asukas;
        
        tontti = lueTontti();
        lueRakennus();
/*         asukkaat = lueAsukkaat(rakennus.getAsukasLkm());

        tontti.tulostaTiedot();
        rakennus.tulostaTiedot();
        asukkaat.tulostaTiedot(rakennus.getAsukasLkm()); */
    }

    public static Tontti lueTontti(){
        String nimi, osoite;
        double pintaAla;
      
        System.out.print("Anna tontin nimi> ");
        nimi = scan.nextLine();

        System.out.print("Anna tontin osoite> ");
        osoite = scan.nextLine();
        
         while (true){
            try {
                System.out.print("Anna tontin pinta-ala neliometreina> ");
                pintaAla = scan.nextDouble();
                scan.nextLine();
                if (pintaAla>0){
                    break;
                } else{
                    continue;
                }
            }
            catch (InputMismatchException e){
                System.err.println("Please enter a number! ");
                scan.nextLine();
                continue;
            }
        }   

        Tontti tontti = new Tontti(nimi, osoite, pintaAla);
        return tontti;
    }

    public static void lueRakennus(){
        String asukkaanNimi;
        int valinta, asuntoLkm, huoneLkm = 0, asukasLkm = 0;
        double pintaAla;
        ArrayList<Double> aPintaAlat;
        ArrayList<Asukas> asukkaat;
        
        aPintaAlat = new ArrayList<Double>();
        asukkaat = new ArrayList<Asukas>();
        Rakennus rakennus = new Rakennus();
        
        while (true){
            try {
                System.out.print("Anna rakennuksen tyyppi numerona 1. kerrostalo 2. rivitalo 3. omakotitalo> ");
                valinta  = scan.nextInt();
                scan.nextLine();
                break;
            }
            catch (InputMismatchException e){
                System.err.println("Syota numero! ");
                scan.nextLine();
                continue;
            }
        } 
        
        while (true){
            try {
                System.out.print("Anna asuntojen maara> ");
                asuntoLkm = scan.nextInt();
                scan.nextLine();
                    if (asuntoLkm>0){
                        break;
                    } else{
                        continue;
                    }
            }
            catch (InputMismatchException e){
                System.err.println("Syota numero! ");
                scan.nextLine();
                continue;
            }
        }

        
        for (int i=1; i<=asuntoLkm; i++){ //kysytaan tiedot jokaiselle asunnolle
            while (true){
                try {
                    System.out.print("Anna asunnon " + i + " huoneiden lukumaara> ");
                    huoneLkm = scan.nextInt();
                    scan.nextLine();
                    if (huoneLkm>0){
                        break;
                    } else{
                        continue;
                    }
                }
                catch (InputMismatchException e){
                    System.err.println("Please enter a number! ");
                    scan.nextLine();
                    continue;
                }
            }
            while (true){
                try {
                    System.out.print("Anna asunnon " + i + " pinta-ala> ");
                    pintaAla = scan.nextInt();
                    scan.nextLine();
                    if (pintaAla>0){
                        Double pAla = new Double (pintaAla);
                        aPintaAlat.add(pAla);
                        break;
                    } else{
                        continue;
                    }
                }
                catch (InputMismatchException e){
                    System.err.println("Please enter a number! ");
                    scan.nextLine();
                    continue;
                }
            }
            while (true){
                try {
                    System.out.print("Anna asunnon " + i + " asukkaiden lukumaara> ");
                    asukasLkm = scan.nextInt();
                    scan.nextLine();
                    if (asukasLkm>0){
                        break;
                    } else{
                        continue;
                    }
                }
                catch (InputMismatchException e){
                    System.err.println("Please enter a number! ");
                    scan.nextLine();
                    continue;
                }
            }
            for (int j=1; j<=asukasLkm; j++){
                System.out.print("Anna " + j + ". asukkaan nimi> ");
                asukkaanNimi = scan.nextLine();
                Asukas asukas = new Asukas(asukkaanNimi);
                asukkaat.add(asukas);            
            }
        }
        switch (valinta){ //tehdaan olio rakennustyypin mukaan
            case 1:
               //tyyppi = "kerrostalo";
               Rakennus.Kerrostalo kerrostalo = rakennus.new Kerrostalo(asuntoLkm, huoneLkm, aPintaAlat, asukkaat);
               //rakennus.Kerrostalo(asuntoLkm, huoneLkm, aPintaAlat, asukkaat);
               break;
           
            case 2:
                //tyyppi = "rivitalo";
                Rakennus.Rivitalo rivitalo = rakennus.new Rivitalo(asuntoLkm, huoneLkm, aPintaAlat, asukkaat);
                break;
            case 3:
                //tyyppi = "omakotitalo";
                Rakennus.Omakotitalo omakotitalo = rakennus.new Omakotitalo(asuntoLkm, huoneLkm, aPintaAlat, asukkaat);
                break;

        }
        

        //return rakennus;
    }
} 



