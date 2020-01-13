import java.util.ArrayList;

public class InsInfoContainer{
    private ArrayList<InsuranceInfo> container;

    InsInfoContainer(){
        container = new ArrayList<InsuranceInfo>();
    }

    public void addObject(InsuranceInfo info){
        container.add(info);
    }

    public void printAll(){
        InsuranceInfo insInfoObj = null;
        Property propertyObj = null;
        System.out.println("---------------------------------");
        System.out.println("Information of all properties");
        for (int i=0; i<container.size(); i++){
            insInfoObj = container.get(i);
            propertyObj = insInfoObj.getProperty();
            System.out.println();
            System.out.println("Type of property:  " + propertyObj.getTypeOfProperty());
            System.out.println("Property location: " + propertyObj.getLocation());
            System.out.println("Insured value:     " + insInfoObj.getInsuredValue() + " euros");
        }
    }

    public void printHigherValued(double value){
        InsuranceInfo insInfoObj = null;
        Property propertyObj = null;
        System.out.println("---------------------------------");
        System.out.println("Information of properties with higher insured value than " + value);
        for (int i=0; i<container.size(); i++){
            insInfoObj = container.get(i);
            if (insInfoObj.getInsuredValue()>value){
                propertyObj = insInfoObj.getProperty();
                System.out.println();
                System.out.println("Type of property:  " + propertyObj.getTypeOfProperty());
                System.out.println("Property location: " + propertyObj.getLocation());
                System.out.println("Insured value:     " + insInfoObj.getInsuredValue() + " euros");
            }else{
                continue;
            }

        }
    }

    public void printLowerValued(double value){
        InsuranceInfo insInfoObj = null;
        Property propertyObj = null;
        System.out.println("---------------------------------");
        System.out.println("Information of properties with lower insured value than " + value);
        for (int i=0; i<container.size(); i++){
            insInfoObj = container.get(i);
            if (insInfoObj.getInsuredValue()<value){
              propertyObj = insInfoObj.getProperty();
              System.out.println();
              System.out.println("Type of property:  " + propertyObj.getTypeOfProperty());
              System.out.println("Property location: " + propertyObj.getLocation());
              System.out.println("Insured value:     " + insInfoObj.getInsuredValue() + " euros");
        }else{
          continue;
        }
    }
  }
}
