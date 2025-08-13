package oops;

public class Parent {
    public static void main(String[] args) {
        Child child = new Child();

    }

    public void hello(){
        System.out.println("Calling Parent");
    }

    public static class MyClass {
        public void sum() {
            System.out.println(1+1);
        }
    }
}
