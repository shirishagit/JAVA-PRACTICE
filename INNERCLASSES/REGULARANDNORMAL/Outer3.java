public class Outer3 {
    int x= 10;
    static int y = 40;
    class Inner3{
        int x = 20;
       public void accessingVariables(){
          int x = 60;
              System.out.println(x); // 60  to access method local variable
              System.out.println(this.x);  //20  to access inner class instance variable
              System.out.println(Outer3.this.x); //10  to access outer class instance variable
              System.out.println(y); // we can also access static variables of outer class variables
       } 
    }
    public static void main(String[] args) {
        new Outer3().new Inner3().accessingVariables();
    }
}

//in the above code we can access both static and non static variables of outer class directly
