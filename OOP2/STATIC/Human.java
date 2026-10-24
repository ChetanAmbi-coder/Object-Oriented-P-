package STATIC;

public class Human {
     public String name;
     public int Age;
     public boolean married;
      public static int population;
     public Human( String name, int age, boolean married){
        this.name = name;
        this.Age = age;
        this.married = married;
        Human.population +=1;

    }
    
    
}
