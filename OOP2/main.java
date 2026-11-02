
class Student {
    int id;
    String name;
    Student( int id, String name){
        this.id = id;
        this.name = name;


    }

    void display() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " +this.name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(01, "liki");

        Student s2 = s1;


        


        s1.display();
        s2.name =  "chethu";
        s2.id = 202;
        s2.display();
    }
}
