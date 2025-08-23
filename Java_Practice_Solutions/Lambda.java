package Java_Practice_Solutions;

    // Functional interface
    interface MyInterface {
        void show();
    }
  final class Main {
        public static void main(String[] args) {
            // Normal way using anonymous class
            MyInterface obj = new MyInterface() {
                public void show() {
                    System.out.println("Hello without Lambda!");
                }
            };
            obj.show();
        }
    }


