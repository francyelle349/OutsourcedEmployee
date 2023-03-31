package outsourcedEmployee;

public class Employee {
    private String name;
   
    protected Integer hours;
    
    protected Double valuePerHour;

    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getHours() {
        return hours;
    }
    public void setHours(Integer hours) {
        this.hours = hours;
    }
    public Double getValuePerHour() {
        return valuePerHour;
    }
    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }
    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public Double payment(){
        return hours*valuePerHour;
    }
    public Double total(){
        return (getHours()*getValuePerHour());
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(getName()+" - ");
        sb.append("$");
        sb.append(total());
     
        return sb.toString();

    }


    

    
}
