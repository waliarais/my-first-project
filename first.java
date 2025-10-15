// Online Java Compiler
// Use this editor to write, compile and run your Java code online

 public class Main {
     int x=18;//is called attribute not variable
     String name= "walia";
     int age =18;
     String course="java core";
           String city="Hyderabad";
           String degree="recently complete enter";
    public static void main(String[] args) {
        Main obj=new Main();
        Main obj2=new Main();
        System.out.println(obj.x);
        obj2.name="java";
        System.out.println(obj2.name);
        
        obj.name="walia";
        System.out.println(obj.name);
        obj.age=18;
        System.out.println(obj.age);
        System.out.println("my name is "+ obj. name);
    System.out.println("my age is"+obj.age);
    System.out.println("i am enrolled in a course called "+obj.course);
    System. out.println("i live in "+obj.city);
    System.out.println("I am "+obj.degree);
    }
}



