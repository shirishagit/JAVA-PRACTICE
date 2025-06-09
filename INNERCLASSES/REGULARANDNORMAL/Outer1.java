public class Outer1 {

    public class Inner1 {
        public void add(int x,int y){
            System.out.println("sum is equal to "+ (x+y));
        }
       
    }
    public static void main(String[] args) {
        Outer1 o = new Outer1();
        Outer1.Inner1 i = o.new Inner1();
        i.add(30, 10); // 1st way

        new Outer1().new Inner1().add(40,60);  // 2nd ways to access inner variables

        Outer1.Inner1 i1 = new Outer1().new Inner1();
        i1.add(20,30); //3rd way to access inner variables
    }

}

//THE ABOVE CODE IS THE EXAMPLE OF REGULAR OR NORMAL INNER CLASSES
//IN THIS CODE WE CAN AEECSS INNERCLASS CODE FROM STATIC AREA OF OUTER CLASS



