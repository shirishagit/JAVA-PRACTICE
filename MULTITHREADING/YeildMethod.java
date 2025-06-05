class InnerYeildMethod extends Thread {
  public void run(){
    for (int i = 0; i < 10; i++) {
        System.out.println("child thread");
        try {
        Thread.sleep(2000) ;
        } catch (Exception e) { }
       Thread.yield();
    }
  }
    
}

public class YeildMethod {
    public static void main(String[] args) {
        InnerYeildMethod y = new InnerYeildMethod();
        y.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("parent Thread");
        }
    }
}
