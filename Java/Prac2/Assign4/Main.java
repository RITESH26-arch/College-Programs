import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Enter Employee ID: ");
        emp.setEmpId(sc.nextInt());
        sc.nextLine(); // clear leftover newline

        System.out.print("Enter Employee Name: ");
        emp.setName(sc.nextLine());

        System.out.print("Enter Employee Monthly Salary: ");
        emp.setSalary(sc.nextDouble());

        double annualSalary = emp.calculateAnnualSalary();

        System.out.println("\n----- Employee Details -----");
        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Monthly Salary: " + emp.getSalary());
        System.out.println("Annual Salary: " + annualSalary);

        sc.close();
    }
}
