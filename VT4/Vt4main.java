import java.util.Scanner;
import java.util.InputMismatchException;

public class Vt4main{ 
    private static Scanner scan = new Scanner(System.in);
    
    public static void main(String [] args){
        boolean newProperty = true;
        boolean validInput;
        String propertyName, location;
        String input; 
        double value, higherValue, lowerValue;

        InsInfoContainer container = new InsInfoContainer();        
        while (newProperty){

            
            System.out.print("Enter name of the property> ");
            propertyName = scan.nextLine();
            
            System.out.print("Enter property location> ");
            location = scan.nextLine();
            
            Property property = new Property(propertyName, location);
            
            while (true){
                try {
                    System.out.print("Enter insured value of the property> ");
                    value = scan.nextDouble();
                    scan.nextLine();
                    break;
                }
                catch (InputMismatchException e){
                    System.err.println("Please enter a number! ");
                    scan.nextLine();
                    continue;
                }
            }
            InsuranceInfo insInfo = new InsuranceInfo(property, value);

            container.addObject(insInfo);

            validInput = false;
            while (true){
                System.out.print("Would you like to add a new property? y/n> ");
                    input = scan.nextLine();
                    if (input.equals("y")){
                        newProperty = true;
                        break;
                        }
                    if (input.equals("n")){                  
                        newProperty = false;
                        break;
                        }
                }
        }
        container.printAll();
        
        while (true){
            try {
                System.out.print("Enter value to print property information of higher insured values> ");
                higherValue = scan.nextDouble();
                scan.nextLine();
                break;
            }
            catch (InputMismatchException e){
                System.err.println("Please enter a number! ");
                scan.nextLine();
                continue;
            }
        }
        container.printHigherValued(higherValue);
        
        while (true){
            try {
                System.out.print("Enter value to print property information of lower insured values> ");
                lowerValue = scan.nextDouble();
                scan.nextLine();
                break;
            }
            catch (InputMismatchException e){
                System.err.println("Please enter a number! ");
                scan.nextLine();
                continue;
            }
        }
        
    }
}