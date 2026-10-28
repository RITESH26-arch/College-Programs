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

    void 
}
