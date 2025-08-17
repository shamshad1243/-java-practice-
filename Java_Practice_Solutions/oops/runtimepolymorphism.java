package oops;

public class runtimepolymorphism {
    //method of parent class
    void print()
    {
            //print statement
        System.out.println("parent class");
    }
}
 //class 2
//helper class
class subclass1 extends Parent{
    //method
     void   print() {
         System.out.println("subclass1");
     }
 }
 //class 3
//helper class
class subclass2 extends Parent {
    //method
void print(){
    //print  statement
    System.out.println("subclass2");
}
 }
 //class 4
//main class
 class topperword{
    //main driver method
     public static void main(String[] args){
         //creating object of class 1
         Parent a;
         //now we will be calling print methods
         //inside main() method
         a = new subclass1();
            ((subclass1) a).print();

            a = new subclass2();
            ((subclass2) a).print();
      }
 }
