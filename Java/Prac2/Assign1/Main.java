import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int noOfStudent;
        System.out.println("Enter how many students details you want to enter ");
        noOfStudent = sc.nextInt();
        sc.nextLine();
        Student[] student = new Student[noOfStudent];
    

        for(int i=0;i<student.length;i++){
            student[i] = new Student();
            System.out.println("\nEnter the details of the Student " + (i+1) + " :- ");

            System.out.println("\nEnter the Student's Roll No => ");
            student[i].rollNo = sc.nextInt();
            sc.nextLine();

            System.out.println("\nEneter the Student's NAme => ");
            student[i].name = sc.nextLine();

        

            System.out.println("\nEnter the Marks of the Student => ");
            student[i].marks =  sc.nextDouble();
            sc.nextLine();

        }

        for(int i=0;i<student.length;i++){
        System.out.println("\nRoll.no => " + student[i].rollNo + "\nName => " + student[i].name + "\nMarks => " + student[i].marks);
        }

        Student studentWithHighestMarks = student[0];

        for(int i=0;i<student.length;i++){
        if(studentWithHighestMarks.marks < student[i].marks){
                studentWithHighestMarks = student[i];
            }
        }

        System.out.println("\nStudent with highest marks " + "\nRoll.no => " + studentWithHighestMarks.rollNo + "\nName => " + studentWithHighestMarks.name + "\nMarks => " + studentWithHighestMarks.marks);
        

        
        



    }
}
