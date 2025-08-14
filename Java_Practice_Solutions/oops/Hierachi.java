package oops;

class Hierachi {
    //super class
    void input()
    {
        System.out.println("enter your name");

    }
}
class a extends Hierachi
{
    void show(){
        System.out.println("my name is rahul");
    }
}
class b extends a{
    void display(){
        System.out.println("my name is shu");
    }
}
class Demo
{
public static void main(String[] args)
{
    a r= new a();
    b r2 = new b();
    r.input(); r.show();
    r2.input(); r2.display();

}
}
