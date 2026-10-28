import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int java, python, cloud, obtainedMarks;
        double percentage;

        System.out.println("\nEnter your marks for the following subjects !");
        
        System.out.println("\nJava : ");
        java = sc.nextInt();
        System.out.println("\nPython : ");
        python = sc.nextInt();
        System.out.println("\ncloud : ");
        cloud = sc.nextInt();
        System.out.println();


        Student s = new Student(java, python, cloud);

        obtainedMarks = s.calculateTotal();
        System.out.println("\nObatained marks : " + obtainedMarks);
        System.out.println();
        percentage = s.calculatePercentage();
        System.out.println("\nPercentage : " + percentage);
        System.out.println();
        s.calculateGrade();

        

    }
}
