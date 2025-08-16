package oops;
 //  abstract
 abstract class Vehicle{
     public abstract void speed();
     public abstract void maintenance();
     public abstract void value();

 }
 class fourwheeler extends Vehicle{
     public void speed(){
         System.out.println("in speed of fourwheeler");
     }
     public void maintenance(){
         System.out.println("in maintenance of fourwheeler");
     }
     public void value()
     {
         System.out.println(" in value of fourwheeler");
     }
 }
 class twowheeler extends Vehicle{
     public void speed(){
         System.out.println(" in speed of twowheeler");
     }
     public void maintenance(){
         System.out.println("in maintenance of twowheeler");
     }
     public void value()
     {
         System.out.println("in value of twowheeler");
     }
 }
 class Airborne extends Vehicle
 {
     public void speed()
     {
         System.out.println("in speed of Airborne ");
     }
     public void maintenance()
     {
         System.out.println("in maintenance of Airborne");
     }
     public void value()
     {
         System.out.println("in value of Airborne ");
     }
 }
     public class AbstractclassExampleproject
     {
         public static void main(String[] args ){
             Vehicle maruti,bajaj,jumbo;
             maruti = new fourwheeler();
             bajaj = new twowheeler();
             jumbo = new Airborne();

              maruti.speed();;
              maruti.maintenance();
              maruti.value();

              bajaj.speed();
              bajaj.maintenance();
              bajaj.value();

              jumbo.speed();
              jumbo.maintenance();
              jumbo.value();
         }
     }

