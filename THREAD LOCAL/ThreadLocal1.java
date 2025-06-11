public class ThreadLocal1 {
    public static void main(String[] args) {
        ThreadLocal<Integer> t1 = new ThreadLocal<>(); //in the cotes we have to specify the the type of value
        ThreadLocal<String> t2 = new ThreadLocal<>();
          System.out.println(t1.get());  //null
          t1.set(100);
          System.out.println(t1.get());  //100
          t2.set("shirisha");
          System.out.println(t2.get());  //shirisha
    }
}
