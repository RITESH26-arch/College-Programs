import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int employeeId;
        double employeeSalary;
        String employeeName,employeeDesignation;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter employee ID => ");
        employeeId = sc.nextInt();
        sc.nextLine();

        System.out.println("\nEnter the employee's name => ");
        employeeName = sc.nextLine();

        System.out.println("\nEnter the Employee's Designation => ");
        employeeDesignation =  sc.nextLine();

        System.out.println("\nEnter the employee's salary => ");
        employeeSalary = sc.nextDouble();
        sc.nextLine();

        Employee e1 = new Employee(employeeId,employeeName,employeeDesignation,employeeSalary);
        e1.display();

        sc.close();
    }
}
