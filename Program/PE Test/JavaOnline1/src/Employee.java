
public class Employee {

    private String name;
    private Double salary;
    private String phone;

    public Employee(String phone, double salary, String name) {
        this.phone = phone;
        this.salary = salary;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    

}
