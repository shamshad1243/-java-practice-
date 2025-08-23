package Java_Practice_Solutions;

 // Functional interface
    interface lamdba2{
        void show();
    }

    class lambda2{
        public static void main(String[] args) {
            // Using Lambda Expression
            MyInterface obj = () -> System.out.println("Hello with Lambda!");
            obj.show();
        }
    }

