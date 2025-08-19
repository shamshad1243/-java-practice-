package Java_Practice_Solutions;

    interface polygon {
        void getArea(int length, int breadth);
    }

    //implementation the polygon interface
    class Rectangle implements polygon {
        public void getArea(int length, int breadth) {
            System.out.println("the area of the Ractangle is " + (length * breadth));
        }
    }
    class main {
        public  static void main(String[] args){
            Rectangle r1 = new Rectangle();
            r1.getArea(5,6);
        }
    }
