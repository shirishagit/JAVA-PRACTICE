public class Outer1 {

    public class Inner1 {
        public void add(int x,int y){
            System.out.println("sum is equal to "+ (x+y));
        }
       
    }
    public static void main(String[] args) {
        Outer1 o = new Outer1();
        Outer1.Inner1 i = o.new Inner1();
        i.add(30, 10);
    }

}


