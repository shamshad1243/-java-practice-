package Java_Practice_Solutions;

public class exception {
    public static void main(String[] args){
        try {
            int div =507/0;
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("end of code ");
    }
}
