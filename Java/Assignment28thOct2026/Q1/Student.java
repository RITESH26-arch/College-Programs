public class Student implements CalculateResult {
    private int java, python, cloud, obtainedMarks, totalMarks = 300;
    private double  percentage;
    boolean invalidMarks = false;
    
    void setJava(int java){
        if(java<0 || java >100){
            System.out.println("\nInvalid marks !\nPlease enter correct marks");
            invalidMarks = true;
        }
        else{
            this.java = java;
        }
    }

    void setpython(int python){
        if(python<0 || python >100){
            System.out.println("\nInvalid marks !\nPlease enter correct marks");
            invalidMarks = true;
        }
        else{
            this.python = python;
        }
    }

    void setCloud(int cloud){
        if(cloud<0 || cloud >100){
            System.out.println("\nInvalid marks !\nPlease enter correct marks");
            invalidMarks = true;
        }
        else{
            this.cloud = cloud;
        }
    }
    
    
    Student(int java, int python, int cloud){
        setJava(java);
        setpython(python);
        setCloud(cloud);
    }

    @Override 
    public int calculateTotal(){
        if(invalidMarks == true)
            return -1;
        else{
            obtainedMarks = java + python + cloud;
            return obtainedMarks;
        }
        
    }

    @Override 
    public double calculatePercentage(){
        if(invalidMarks == true)
            return -1;
        else{
            percentage = (obtainedMarks * 100.0) / totalMarks;
            return percentage;
        }
    }

    @Override 
    public void calculateGrade(){
        if(invalidMarks == true)
            return;
        else{
            if(percentage>=75 && percentage<=100)
            System.out.println("\nDistinction !");
        else if(percentage>=60)
                System.out.println("\nA grade");
            else if(percentage>=50)
                    System.out.println("\nB grade");
                else if(percentage>=40)
                        System.out.println("\nC grade");
                    else if(percentage>=35)
                            System.out.println("\nD grade");
                        else
                            System.out.println("\nFail !");
        }
    }

    public double getPercentage(){
        return percentage;
    }

    public int getTotalMarks(){
        return totalMarks;
    }
    
}
