package oops;

public class polymorphismcompilertime {
    // method with 2 integer parameters
    static int multiply( int a ,int b) {

        //RETURN product of integer number
            return a*b;
    }
    /*
    method
    With same name but 2 double parameters
    */
    static double multiply( double a,double b)
    {
        //return product of double number
        return a*b;
    }
}
// class 2

//main class
class supper{
    //main driver method
public static void main(String[] args ){

    // calling method by passing
    // input as in arguments
    System.out.println(polymorphismcompilertime.multiply (2,4));
    System.out.println(polymorphismcompilertime.multiply(5.5,6.3));
}
}
