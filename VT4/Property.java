public class Property{
    private String typeOfProperty, location;
    
    Property(String typeOfProperty, String location){
        this.typeOfProperty = typeOfProperty;
        this.location = location;
    }
    
    public void setTypeOfProperty(String property){
        this.typeOfProperty = property;
    }
    
    public void setLocation(String location){
        this.location = location;
    }

    public String getTypeOfProperty(){
        return typeOfProperty;
    }
    
    public String getLocation(){
        return location;
    }

}