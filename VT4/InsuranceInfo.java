public class InsuranceInfo{
        
    private double insuredValue;
    private Property property;

    InsuranceInfo(Property property, double value){
        this.insuredValue = value;
        this.property = property;
    }
    
    public void setInsuredValue(double value){
        this.insuredValue = value;
    }
    
    public void setProperty(){
        this.property = property;
    }
    
    public double getInsuredValue(){
        return insuredValue;
    }

    public Property getProperty(){
        return property;
    }
    
}