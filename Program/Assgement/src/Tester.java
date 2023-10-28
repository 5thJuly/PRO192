 public class Tester extends Employee {  	
    private double bonusRate; 	    
    private String type;
    public Tester(String empID, String empName, int baseSal, double bonusRate, String type) {
        super(empID, empName, baseSal);
        this.bonusRate = bonusRate;
        this.type = type;
    }
    public double getBonusRate() {
        return bonusRate;
    }
    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }  

     	
    	
    @Override
    public double getSalary() { 		
        return getBaseSal() + getBonusRate() * getBaseSal(); 	
    }  
} 
    

    
