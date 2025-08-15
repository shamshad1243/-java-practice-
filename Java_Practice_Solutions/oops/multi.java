package oops;

public interface multi {
        void Show ();

    interface Ani {
        void Display();
    }
    class multiple implements oops.multi {
        public void Show(){
            System.out.println("interface multi");
        }
        public void Display()
        {
            System.out.println(" interface A ");
        }
        public static void main(String[] args){
            multiple m=new multiple();
            m.Show(); m.Display();
        }
    }


}
