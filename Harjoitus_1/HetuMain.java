import java.io.*;
import java.util.Scanner;

public class HetuMain {
   
   static Scanner sc = new Scanner(System.in);
   
   public static void main(String [] args){
      
      
      
      String hetu;
      
      System.out.print("Anna henkilotunnus > ");
      hetu = sc.nextLine();
      
      printBirthdate( hetu );
      
      System.out.println("Apaina ENTER lopettaaksesi");
      sc.nextLine();
   }
   
   public static void printBirthdate(String hetu){
      
      if(checkIdNumber(hetu))
      {
         System.out.println("Syntymapaiva on: ");
         
         for(int i=0; i<6; ++i)
         {
            System.out.print(hetu.charAt(i));
            
            if(i==1 || i==3)
               System.out.print(".");
            
            if(i==3)
            {
               switch(hetu.charAt(6))
               {
                  case 'A':
                     System.out.print("20");
                     break;
                  case '+':
                     System.out.print("18");
                     break;
                  case '-':
                     System.out.print("19");
                     break;
               }
            }
         }
         
         System.out.println();
      }
      else
      {
         System.out.println( "Virheellinen henkilotunnus!");
      }
      
   }
   
   public static boolean checkIdNumber(String hetu){
      
      if(hetu.length() != 11 || (hetu.charAt(6) != 'A' && hetu.charAt(6) != '+' && hetu.charAt(6) != '-'))
      {
         return false;
      }
      else
      {
         return true;
      }
      
      
   }
   
}


