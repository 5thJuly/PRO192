
public class Validate implements Vali{

    @Override
    public double f1(Employee e) {
        double salary = e.getSalary();
        if(salary >=2000) {
            return salary + 0.1*salary;
        }
        else {
            return salary;
        }
        
    }

    @Override
    public String f2(Employee e) {
        String phone = e.getPhone();
        String result = "" ;
        for (int i = 0; i < phone.length(); i+=3){ //nhay 3 buoc 1 lan  {
            result = result + phone.substring(i, i + 3) + "-" ; 
        }
        
        return result.substring(0, result.length()-1); //cat dau gach ngang cuoi cung
    }    
        
}

    

  
    

   
   

