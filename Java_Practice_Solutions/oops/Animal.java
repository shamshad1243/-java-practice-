package oops;

public class Animal {
    // Parent class (Super Class
        void eat() {
            System.out.println("Animal is eating...");
        }
    }

    // Child class (Sub Class)
    class Dog extends Animal {
        void bark() {
            System.out.println("Dog is barking...");
        }
    }
// Main class to test Inheritance
    class InheritanceExample {
        public static void main(String[] args) {
            Dog myDog = new Dog();

            // Method from parent class
            myDog.eat();

            // Method from child class
            myDog.bark();
        }
    }


