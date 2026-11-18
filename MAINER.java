import java.util.Scanner;
class MAINER{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter a value from 1 to 3");
        int a = in.nextInt();
        switch(a){
            case 1:
                System.out.println("this is a");
                break;
            case 2:
                System.out.println("this is 2");
                break;
            case 3:
                System.out.println("this is 3");
            default:
                System.out.println("plese enter between 1 to 3");

        }
        in.close();


       
        }
      
           
      

    }

