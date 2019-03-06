import java.io.*;
import java.util.Scanner;

public class Teht3_extra{

	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		String sotu;
		
		System.out.println("Anna hetusi, niin sanon syntymapaivasi.");
		sotu = reader.next();
		printBirthdate(sotu);
		
	}
   
   static boolean checkIdNumber(final String hetu){
		boolean retVal = true;
		
		if(hetu.length() != 11){
			// length not OK
			retVal = false;
		}
		else{
			// check century caharacter
			switch(hetu.charAt(6)){
				case '+':case'-':case'A':break;
				default:
					retVal = false;
			}
		}
      
		return retVal;
	}
	
	static boolean checkLeapYear(int year){
		boolean retVal = true;
		
		if(year%4 != 0){
			retVal = false;
		}
		else {
			if(year%100 == 0 && year%400 != 0)
				retVal = false;
		}
		
		return retVal;
	}
	
	static boolean checkValidCharacter(final String hetu){
		String checkString = "0123456789ABCDEFHJKLMNPRSTUVWXY";
		String numStr = hetu.substring(0,6);
		numStr += hetu.substring(7,10);
		int number = new Integer(numStr).intValue();
		int res = number%31;
		
		return checkString.charAt(res)==hetu.charAt(10);
	}
	
	static boolean checkBirthdate(final String date){
		boolean retVal = true;
		Scanner s = new Scanner(date).useDelimiter("\\.");
		int paiva = s.nextInt();
		int kuu = s.nextInt();
		int vuosi = s.nextInt();
		s.close();
		
		if(vuosi < 0 || kuu < 1 || kuu > 12 || paiva < 1 || paiva > 31){
			retVal = false;
		}
		else {
			switch(kuu){
				case 4:case 6:case 9:case 11:
					if(paiva == 31)
						retVal = false;
					break;
				case 2:
					if(paiva > 29)
						retVal = false;
					if(paiva == 29)
						retVal = checkLeapYear(vuosi);
					break;
			}
		}
		return retVal;
	}
	
	static void printBirthdate(final String hetu){
		if(!checkIdNumber(hetu)){
			System.out.println("HETU invalidi!");
		}
		else {
			String birthdate = "";
			birthdate += hetu.substring(0,2);
			birthdate += ".";
			birthdate += hetu.substring(2,4);
			birthdate += ".";
			switch(hetu.charAt(6)){
				case '+':
					birthdate += "18";
					break;
					
				case '-':
					birthdate += "19";
					break;
					
				case 'A':
					birthdate += "20";
					break;
					
				default:
					// Should never happen
					System.out.println("HETU invalidi!");
					return;
			}
			birthdate += hetu.substring(4,6);
			if(!checkBirthdate(birthdate)){
				System.out.println("HETUssa viallinen syntymapaiva! ");
			}
			else if (!checkValidCharacter(hetu)){
				System.out.println("HETUn tarkistusmerkki kunnoton!");
			}
			else{
				System.out.println("Syntymapaiva = " + birthdate);
			}
			
		}
	}
}