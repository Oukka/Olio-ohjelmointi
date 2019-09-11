public class RegularSubscription extends Subscription{
    private int subscriptionDuration;
    private double totalPrice;
    
    RegularSubscription(String magazineName, String subscriberName, String address, int duration){
        super(magazineName, subscriberName, address);
        this.subscriptionDuration = duration;
        totalPrice = duration * monthlyPrice;
    }

    public void printInvoice(){
        System.out.println();
        System.out.println("---Invoice---");
        System.out.println("Name of the magazine:   " + magazineName);
        System.out.println("Type of the subscribe:  regular subscription");
        System.out.println("Substriction duration:  " + subscriptionDuration + " monthts");
        System.out.println("Total price:            " + totalPrice + " euros");       
        System.out.println("Name of the subscriber: " + subscriberName);
        System.out.println("Subscriber address:     " + subscriberAddress);
        System.out.println();
    }

    public void setSubscriptionDuration(int duration){
        this.subscriptionDuration = duration;
    }
    
    public int getSubscriptionDuration(){
        return subscriptionDuration;
    }
    
    public void setTotalPrice(double price){
        this.totalPrice = price;
    }
    
    public double getTotalPrice(){
        return totalPrice;  
    }   
}