

     class A
     {
         void show()
         {
             System.out.println("super class ");
         }

     }
     class B extends  A
     {
         @Override
         void show(){
             System.out.println("sub class ");
         }
     }
     class main
     {
         public static void main(String[] args ){
                B r =new B();
                r.show();
         }
     }