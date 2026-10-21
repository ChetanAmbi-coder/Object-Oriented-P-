package OOP1;

public class clasconstruct {
  static   class employee{
        String name;
        int Age;
        double salary;
        double  experience;
        
    
        employee(String name , int Age, double salaray, double experience){
            this.name  = name;
            this.Age = Age;
            this.salary = salaray;
            this.experience = experience;
        }
    
    
}
  
    public static void main(String[] args){
       
        employee e1 = new  employee("chetan", 21, 150000, 2.50);
        

        System.out.println("the employee name:-" +e1.name);




    }

    
}
