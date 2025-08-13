package oops;

public class Simple {
    //super class
    int roll,marks;
    String name;
    void input()
    {
        System.out.println(" enter roll name & marks:");

    }
}
class sohel extends Simple  {
    //subclass
    void display()
    {
        roll=10;name="sail";marks=98;
        System.out.println(roll+" "+ name+" "+marks);
    }
    public static void main(String[] arge){
       sohel r= new sohel();
        r.input();
        r.display();
    }
}
