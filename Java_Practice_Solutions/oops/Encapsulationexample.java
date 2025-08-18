package oops;

public class Encapsulationexample {
    int length ;
    int breadth;
    Encapsulationexample(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }
public void getEncapsulationexample()
{
    int Encapsulationexample = 2 * ( length + breadth);
    System.out.println("perimeter of Rectangle : "+ Encapsulationexample  );
}
}
class main {
public  static void main(String[] args){
    Encapsulationexample rectangle  = new Encapsulationexample(3,4 );
    rectangle.getEncapsulationexample();
}
}
