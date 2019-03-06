import java.util.Scanner;

public class Tervehdys {
   
   public static void main(String [] args){
      
      Scanner nappaimisto = new Scanner(System.in);
      
      String nimi;
      
      System.out.print("Anna sukunimesi ja etunimesi valilyonnilla erotettuna >");
      nimi = nappaimisto.nextLine();
      
      System.out.println("Tervetuloa Java-ohjelmoinnin maailmaan " + nimi);
      //nimi = nappaimisto.nextLine();
      
   }
}
