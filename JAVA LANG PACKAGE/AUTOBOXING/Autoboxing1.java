public class Autoboxing1 {

       static Integer x = 50; // compiler converts int to Interger automatically by Autoboxing
    public static void main(String[] args) {
          int i = x;
        Integer I = Integer.valueOf(10);  // internally Autoboxing concept is implemanted by using valueOf() method
        Long L = Long.valueOf(100);
        System.out.println(i);
        System.out.println(I);
        System.out.println(L);
       
    }
}

//Automatic conversion of Primitive to Wrapper object by compiler is call Autoboxing.