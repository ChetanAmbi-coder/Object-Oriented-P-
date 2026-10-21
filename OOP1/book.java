package OOP1;
  class Book{

    
    String title;
    String Author;
    final String isbn = "978-0134685991";
    Book(){
        String title;
        String author;
        String isbn;

    }
    Book( String title, String author, String isbn){
        this.title = title;
        this.Author= author;
       // this.isbn = isbn;


    }
     void display(){
        System.out.println("Title id:-" + this.title);
         System.out.println("Author:-" + this.Author);
          System.out.println("ISBN:-" + this.isbn);
        
        
    }
    
    
}

public class book {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("2026", "george well", "18772517682768"); //the is bn is not worked on this becaues we used a final keyword so..//
        b1.display();
        
        b2.display();
        
    }
    
   
}
