public class StandingSubscription extends Subscription{
    private int discountPercent;
    private double totalPrice;

    StandingSubscription(String magazineName, String subscriberName, String address){
        super(magazineName, subscriberName, address);
        int discountPercent = 10;
        double price = 12*monthlyPrice;
        totalPrice = calculatePrice(price, discountPercent);
    }
    
    public double calculatePrice(double price, int discountPercent){
        totalPrice = price*(100-discountPercent)/100;
        return totalPrice;
    }

    public void printInvoice(){
        System.out.println();
        System.out.println("---Invoice---");
        System.out.println("Name of the magazine:   " + magazineName);
        System.out.println("Type of the subscribe:  standing subscription");
        System.out.println("Substriction duration:  12 monthts");
        System.out.println("Total price:            " + totalPrice + " euros");       
        System.out.println("Name of the subscriber: " + subscriberName);
        System.out.println("Subscriber address:     " + subscriberAddress);
        System.out.println();
    }
    public void setDiscountPercent(int discPrcnt){
        this.discountPercent = discPrcnt;
    }
    
    public int getDiscountPercent(){
        return discountPercent;
    }
    
    public void setTotalPrice(double price){
        this.totalPrice = price;
    }
    
    public double getTotalPrice(){
        return totalPrice;  
    }        
}