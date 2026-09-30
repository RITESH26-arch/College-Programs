import java.util.Scanner;

public class Main {

    static Student createStudent(Scanner sc) {
        Student s = new Student();

        System.out.print("Enter Roll No: ");
        s.rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        s.name = sc.nextLine();

        System.out.print("Enter Marks: ");
        s.marks = sc.nextDouble();

        return s;
    }

    static char calculateGrade(double marks) {
        if (marks >= 90) return 'A';
        else if (marks >= 75) return 'B';
        else if (marks >= 60) return 'C';
        else if (marks >= 40) return 'D';
        else return 'F';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = createStudent(sc);
        char grade = calculateGrade(student.marks);

        System.out.println("\n----- Student Details -----");
        System.out.println("Roll No: " + student.rollNo);
        System.out.println("Name: " + student.name);
        System.out.println("Marks: " + student.marks);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
