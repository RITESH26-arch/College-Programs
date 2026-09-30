public class Employee {
    // Private data members
    private int empId;
    private String name;
    private double salary;

    // Getter methods (accessors)
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Setter methods (mutators)
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to calculate and return annual salary
    public double calculateAnnualSalary() {
        return salary * 12;
    }
}
