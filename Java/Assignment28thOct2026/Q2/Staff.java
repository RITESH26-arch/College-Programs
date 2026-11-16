public class Staff {
    private String name, designation, birthDate;
    private double salary;

    void setName(){
        int i=0;
        while(i<name.length()){
            if(Character.isDigit(name.charAt(i))){
                System.out.println("\nPlease enter a valid name !");
                break;
            }
            else
                this.name = name;
        }
    }

    void setDesignation(){
        this.designation = designation;
    }

    void setbirthDate(){
        int i=0;
        while(i<birthDate.length()){
            if(Character.isDigit(birthDate.charAt(i))){
                this.birthDate = birthDate;
            }
            else
                System.out.println("\nPlease enter a valid date !");
                break;
        }
    }

    void setSalary(){
        int i=0;
        while(i<salary.size){
            if(Character.isDigit(salary.charAt(i))){
                this.salary = salary;
            }
            else
                System.out.println("\nPlease enter a valid date !");
                break;
        }
    }

    Staff(String name, String designation, String birthDate, double salary){
        setName();
        setDesignation();
        setbirthDate();
        setSalary();
    }
}
