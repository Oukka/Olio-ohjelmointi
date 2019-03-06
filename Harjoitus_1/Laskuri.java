import java.util.Scanner;

public class Laskuri {
   
   public static void main(String [] args){
      
      Scanner nappaimisto = new Scanner(System.in);
      
      int luku;
      int summa = 0;
      int lukumaara = 0;
      double keskiarvo = 0.0;
      int suurin = Integer.MIN_VALUE;
      int pienin = Integer.MAX_VALUE;
      
      do {
         
         System.out.print("Anna positiivinen kokonaisluku >");
         luku = nappaimisto.nextInt();
         
         if( luku > 0){
            lukumaara++;
            summa = summa + luku;
            
            if( luku > suurin){
               suurin = luku;
            }
            if(luku < pienin){
               pienin = luku;
            }
         }
         
      }while(luku > 0);
      
      if( lukumaara > 0 ){
         keskiarvo = (double)summa/lukumaara;
         System.out.printf("Lukujen keskiarvo on %.2f %n", keskiarvo);
         System.out.printf("ja suurin luku on %d ja pienin luku on %d %n", suurin, pienin);
      }else{
         System.out.println("Et syottanyt yhtaa kelvollista lukua%n");
      }
   }
}
