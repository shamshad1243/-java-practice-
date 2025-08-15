package oops;
interface itservice{
  public  void getItservice();
}
interface hardware{
    public default void grtHardware() {
    }
}
class Basecompany  implements  itservice{
void getBasecompany(){
    System.out.println("base company printed");
    }
   public void getItservice(){
        System.out.println(" get It service ");
    }
public void getHardware(){
    System.out.println("get hardware");
}
}
class childcompany extends Basecompany
{
}
class localcompany extends childcompany
{
}
 class Sharedcompany extends Basecompany{
 }
public class Hybridinheritanceexample {
    public static void main(String[] args){
         localcompany lc =new localcompany();
         Sharedcompany sc = new Sharedcompany();
    lc.getBasecompany();
    sc.getBasecompany();
    sc.getItservice();
    sc.getHardware();
    }

}
