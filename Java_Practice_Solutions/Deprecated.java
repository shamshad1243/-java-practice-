package Java_Practice_Solutions;

 class oldclass {
     @Deprecated
     void oldmethod(){
         System.out.println("this is an old method (deprecated).");
     }
 }
 class newclass extends oldclass{
     void newmethod(){
         System.out.println("this is a new method .");
     }
     public static void main(String[] args ){
         newclass obj = new newclass();
         obj.oldmethod(); //warning :deprecated method
         obj.oldmethod();

     }
 }
