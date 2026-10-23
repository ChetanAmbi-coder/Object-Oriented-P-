package OOP1;

import java.util.stream.Gatherer.Integrator;

public class wrapperclass {
   



    public static void main(String[] args) {
        //WRAPPER OF INTEGER,Boolean,Float,Double,Character,String//  
        Integer a  = (20);
        Boolean b = Boolean.valueOf(true);
        Float c = 2.5f;
        Double d = 3.56456;
        Character initial = 'A';
        String Name = "CHETAN";
        //COVERTEED FROM WRAPPER TO PREMITIVE //   
        int A = a;
        boolean B = b;
        float C = c;
        double D = d;
        char INITIAL =initial;
        String NAME = Name;
        //ACCESSING THE WRAPPER VALUES THROUH PREMITIVIE TYPES//
        System.out.println(A);
         System.out.println(B);
          System.out.println(C);
           System.out.println(D);
            System.out.println(INITIAL);
             System.out.println(NAME);

            

        
    }
    
}
