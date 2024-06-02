import java.time.LocalDate;

public class Employee extends Citizen {
    private int employeeIdNumber;
    private String companyName;
    private String position;
    private double salary;
    
    public Employee(int employeeIdNumber, String companyName, String position, double salary) {
        this.employeeIdNumber = employeeIdNumber;
        this.companyName = companyName;
        this.position = position;
        this.salary = salary;
    }

    public Employee(int citizenIdNumber, String lastName, String firstName, 
            LocalDate birthDate, String address,
            int employeeIdNumber, String companyName, String position, double salary) {
        
        super(citizenIdNumber, lastName, firstName, birthDate, address);
        this.employeeIdNumber = employeeIdNumber;
        this.companyName = companyName;
        this.position = position;
        this.salary = salary;
    }

    public int getEmployeeIdNumber() {
        return employeeIdNumber;
    }

    public void setEmployeeIdNumber(int employeeIdNumber) {
        this.employeeIdNumber = employeeIdNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
