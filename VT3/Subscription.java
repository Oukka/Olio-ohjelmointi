public class Subscription{
    protected String magazineName, subscriberName, subscriberAddress;
    protected double monthlyPrice, totalPrice;

 
    Subscription(String magazineName, String subscriberName, String address){
        monthlyPrice = 10;
        this.magazineName = magazineName;
        this.subscriberName = subscriberName;
        this.subscriberAddress = address;
    }
    
    public void printInvoice(){
    }
    
    public void setMagazineName(String name){
        this.magazineName = name;
    }
    
    public void setSubscriberName(String name){
        this.subscriberName = name;
    }
    
    public void setMonthlyPrice(double price){
        this.monthlyPrice = price;
    }
    
    public void setTotalPrice(double price){
        this.totalPrice = price;
    }
    
    public void setSubscriberAddress(String address){
        this.subscriberAddress = address;
    }
    
    public String getMagazineName(){
        return magazineName;
    }
    
    public String getSubsriberName(){
        return subscriberName;
    }
    
    public double getMonthlyPrice(){
        return monthlyPrice;
    }
        
    public double getTotalPrice(){
        return totalPrice;
    }
    
    public String getsubscriberAddress(){
        return subscriberAddress;
    }
    
}

 
    
