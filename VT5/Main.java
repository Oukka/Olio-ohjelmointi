import java.util.*;

public class Main{
    private static Scanner scan = new Scanner(System.in);
    
    public static void main(String [] args){
        Tontti tontti;
        Rakennus rakennus;
        Asukas asukas;
        
        tontti = lueTontti();
		rakennus = lueRakennus();
		asukas = lueAsukkaat(rakennus.getAsukasLkm());
		tontti.tulostaTiedot();
		rakennus.tulostaTiedot();
		asukas.tulostaTiedot();
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

    public static Rakennus lueRakennus(){
        String tyyppi;
        int valinta, asuntoLkm, huoneLkm = 0, asukasLkm = 0, lkm = 0;
        double pintaAla;
        ArrayList<Double> aPintaAlat;
        
        aPintaAlat = new ArrayList<Double>();
        Rakennus rakennus = new Rakennus();
        
        while (true){
            try {
                System.out.print("Anna rakennuksen tyyppi numerona 1. kerrostalo 2. rivitalo 3. omakotitalo> ");
                valinta  = scan.nextInt();
				scan.nextLine();
                if (valinta>=1 && valinta <= 4){
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
                    System.err.println("Anna numero! ");
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
                    System.err.println("Anna numero! ");
                    scan.nextLine();
                    continue;
                }
            }
            while (true){
                try {
                    System.out.print("Anna asunnon " + i + " asukkaiden lukumaara> ");
                    lkm = scan.nextInt();
                    scan.nextLine();
                    if (lkm>0){
						asukasLkm+=lkm;
                        break;
                    } else{
                        continue;
                    }
                }
                catch (InputMismatchException e){
                    System.err.println("Anna numero! ");
                    scan.nextLine();
                    continue;
                }
            }

        }
        switch (valinta){ //tehdaan olio rakennustyypin mukaan
            case 1:
                tyyppi = "kerrostalo";
                Rakennus.Kerrostalo kerrostalo = rakennus.new Kerrostalo(tyyppi, asuntoLkm, huoneLkm, aPintaAlat, asukasLkm);
				return kerrostalo;
            case 2:
                tyyppi = "rivitalo";
                Rakennus.Rivitalo rivitalo = rakennus.new Rivitalo(tyyppi, asuntoLkm, huoneLkm, aPintaAlat, asukasLkm);
				return rivitalo;
            case 3:
                tyyppi = "omakotitalo";
                Rakennus.Omakotitalo omakotitalo = rakennus.new Omakotitalo(tyyppi, asuntoLkm, huoneLkm, aPintaAlat, asukasLkm);
				return omakotitalo;
				
        }
        return rakennus; //tanne ei paasta mutta koodi ei kaanny ilman

    }
	
	public static Asukas lueAsukkaat(int asukasLkm){
		String asukkaanNimi;
		
		Asukas asukas = new Asukas();
		for (int j=1; j<=asukasLkm; j++){
		System.out.print("Anna " + j + ". asukkaan nimi> ");
		asukkaanNimi = scan.nextLine();
		asukas.lisaaAsukas(asukkaanNimi);
        }
		
		return asukas;
	}
} 



