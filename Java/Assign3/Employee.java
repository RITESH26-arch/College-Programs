
public class Employee {

    private int employeeId;
    private double employeeSalary;
    private String employeeName,employeeDesignation;

    Employee(int employeeId,String employeeName,String employeeDesignation,double employeeSalary){
    this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeDesignation = employeeDesignation;
        this.employeeSalary = employeeSalary;
    }

    void display(){
        System.out.println("\nEmployee ID => " + employeeId +
            "\nEmployee name => " + employeeName +
            "\nEmployee designation => " + employeeDesignation +
            "\nEmployee salary => " + employeeSalary);
    }
}