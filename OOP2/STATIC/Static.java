package STATIC;

import javax.print.attribute.standard.MediaSize.NA;

class Students{
    String NAME;
    int Age;

     static String  college  = "Vemana IT";
     static String Branch = "CSE";

         Students(String name, int age){
        this.NAME = name;
        this.Age = age;


     }
     void display(){
        System.out.println(NAME + " " +Age + " "  + Branch + " " +college);
     }
     
     }
    

public class Static {
        public static void main(String[] args) {
            Students S1 = new Students("chetan", 19);
            Students S2 = new Students("Adarshreddy", 20);

        S1.display();
        S2.display();

     }
    
}
