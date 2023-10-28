 
import java.util.ArrayList;  

public class TeamLeader extends Developer {  	
    public TeamLeader(String empID, String empName, int baseSal, String teamName,ArrayList<String> programmingLanguages, int expYear, double d) {
        super(empID, empName, baseSal, teamName, programmingLanguages, expYear);
        
    }

    private double bonus_rate;   	
    
    public double getBonusRate() { 		
        return bonus_rate; 	}  	
        
    public void setBonusRate(double bonus_rate) { 		
        this.bonus_rate = bonus_rate; 	
    }  	
    
    	 	
        @Override 	public double getSalary() { 		
            return super.getSalary() + super.getSalary() * getBonusRate(); 	
        }  
} 

