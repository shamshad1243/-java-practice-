package oops;

public class multilevel {
    int a,b,c;
    void add()
    {
        a=10; b=20;
             c=a+b;
        System.out.println("sum of two number: "+c);
    }
    void sub(){
        a=200;
        b=300;
        c=a-b;
        System.out.println("sub of two number :"+c);
    }
}
class A extends multilevel
{
    void mul()
    {
        a=10; b=20;
        c=a*b;
        System.out.println("mul of two number: "+c);
    }
    void div(){
        a=400;
        b=200;
        c=a/b;
        System.out.println("div of two number :"+c);
    }
}
class B extends A
{
    void rem()
    {
        a=10;b=3;
        c=a%b;
        System.out.println("remainder of two number:" +c);
    }
}
class Test
{
    public static void main(String[] arge ){
        A r=new B();
        r.add();r.sub();
        r.mul();r.div();
        ((B) r).rem();
    }
}
