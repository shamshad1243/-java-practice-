package oops;

public class encapsulationexample2 {
    // Example of Encapsulation in Java

        private String name;
        private int age;
        // getter method for name
        public String getName() {
            return name;
        }
        // setter method for name
        public void setName(String name) {
            this.name = name;
        }
        // getter method for age
        public int getAge() {
            return age;
        }
        // setter method for age
        public void setAge(int age) {
            if (age > 0) {  // validation
                this.age = age;
            } else {
                System.out.println("Age must be positive!");
            }
        }
    }
     class Main {
        public static void main(String[] args) {
            encapsulationexample2 s1 = new encapsulationexample2();

            // setting values via setters
            s1.setName("Rahul");
            s1.setAge(20);
            // getting values via getters
            System.out.println("Name: " + s1.getName());
            System.out.println("Age: " + s1.getAge());
        }
    }


