
package MAIN;
import STATIC.Human;


public class MAIN {
    public static void main(String[] args) {
        Human liki = new Human("likth",19, false );
        Human chetu = new Human("chetu",19,false);
        System.out.println("====LIKHI details===");
        System.out.println(liki.name);
         System.out.println(liki.Age);
          System.out.println(liki.married);
          System.out.println(liki.population);
          System.out.println("====Chetu details===");
          System.out.println(chetu.name);
         System.out.println(chetu.Age);
          System.out.println(chetu.married);
          System.out.println(chetu.population);
            System.out.println("hey");
    }
}
