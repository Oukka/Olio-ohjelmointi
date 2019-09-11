import java.util.Scanner;
import java.util.InputMismatchException;

public class Vt3main{  
    private static Scanner scan = new Scanner(System.in);
    
    public static void main(String [] args){ 
        String magazineName, subscriberName, address;
        String input;
        boolean newSub = true;
        boolean validInput;
        int duration;
        
        while (newSub){
            validInput = false;
            System.out.print("Enter the name of the magazine you want to order> ");
            magazineName = scan.nextLine();
            
            System.out.print("Enter the name of the subscriber> ");
            subscriberName = scan.nextLine();
            
            System.out.print("Enter subscriber address> ");
            address = scan.nextLine();
            
            while (validInput == false){
                System.out.print("Standing subscription y/n ?> ");
                input = scan.nextLine();
                if (input.equals("y")){
                    validInput = true;
                    System.out.println("You chose standing subscription. ");
                    Subscription sub = new StandingSubscription(magazineName, subscriberName, address);
                    printSubscriptionInvoice(sub);
                    }

                if (input.equals("n")){
                    validInput = true;
                    System.out.println("You chose regular subscription. ");

                    while (true){
                        try {
                            System.out.print("Enter subscription duration in months> ");
                            duration = scan.nextInt();
                            scan.nextLine();
                            break;
                        }
                        catch (InputMismatchException e){
                            System.err.println("Please enter a number! ");
                            scan.nextLine();
                            continue;
                        }
                    }
                    Subscription sub = new RegularSubscription(magazineName, subscriberName, address, duration);
                    printSubscriptionInvoice(sub);
           
                }
            }
            
            validInput = false;
            while (true){
                System.out.print("Would you like to make a new subscription? y/n> ");
                    input = scan.nextLine();
                    if (input.equals("y")){
                        newSub = true;
                        break;
                        }
                    if (input.equals("n")){                  
                        newSub = false;
                        break;
                        }
                }
            }
        }
    
    public static void printSubscriptionInvoice(Subscription subs){
        subs.printInvoice();
        
    }   

}
