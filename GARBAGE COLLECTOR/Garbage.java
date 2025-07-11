public class Garbage {
    public static void main(String[] args) {
      // String s = new String("Shirisha");
        Garbage  s = new Garbage();
        s.Finalize();
        s = null;
        System.gc();
        System.out.println("Main Method end");
    }
    public void Finalize(){
        System.out.println("Finalize method called");
    }
}
