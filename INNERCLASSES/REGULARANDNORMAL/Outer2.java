public class Outer2 {
    class Inner2 {
       public void m1(){
          System.out.println("Accessing innerclass code from instance area of outer");
       }  
    }
    public void m2(){
        Inner2 i = new Inner2();
        i.m1();
    }
    public static void main(String[] args) {
        Outer2 o = new Outer2();
        o.m2();
    }
}

//THE ABOVE CODE IS THE EXAMPLE OF REGULAR OR NORMAL INNER CLASS
//IN THIS CODE WE CAN ACCESS INNER CLASS CODE FROM INSTANCE ARE OF OUTER CLASS