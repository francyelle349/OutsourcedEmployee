package outsourcedEmployee;

public class OutsourceEmployee extends Employee {
    private Double additionalCharge;
    
    public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }
    public Double getAdditionalCharge() {
        return additionalCharge;
    }
    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    @Override
    public Double payment(){
        return (hours*valuePerHour) + getAdditionalCharge() *1.1;
    }
    

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(getName()+" - ");
        sb.append("$");
        sb.append(payment());
     
        return sb.toString();

    }


    
}
