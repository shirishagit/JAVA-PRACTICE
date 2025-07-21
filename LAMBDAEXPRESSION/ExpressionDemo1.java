@FunctionalInterface
interface  SingleMethod {
 public int sum(int a , int b);
}



public class ExpressionDemo1 {
    public static void main(String[] args) {
     SingleMethod s = (a,b)-> {
          return a+b;
     };
    System.out.println(s.sum(10,20));
    System.out.println(s.sum(470,140));
    }
}

//This is a lambda express 
//The funcion is called anly from a single abstract method.


