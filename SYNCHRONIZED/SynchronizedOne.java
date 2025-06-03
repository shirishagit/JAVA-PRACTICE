class Display {
    public synchronized void wish(String name){
        for (int i = 0; i <= 10; i++) {
           System.out.print("love you  : "); 
           try {
              Thread.sleep(2000);
           } catch (InterruptedException e) {}
               System.out.println(name);
           
        }
    }
}

class MyThread extends Thread{
    Display d;
    String name;
   MyThread(Display d,String name){
    this.d = d;
    this.name = name;

   }
   public void run(){
    d.wish(name);
   }
}

public class SynchronizedOne {
    public static void main(String[] args) {
        Display d = new Display();
        MyThread m = new MyThread(d, "Narendra sai");
        MyThread t = new MyThread(d, "Shirisha");
        m.start();
        t.start();
    }   
}


// IN THE ABOVE CODE WE HAVE USED SYNCHRONIZE MODIFIER 
//SYNCHRONIZED KEYWORD IS USED FOR REGULAR EXECUTION OF DATA 
//BY USING SYNCHRONIZE KEYWORD THE FIRST THREAD WILL EXECUTE AND THEN THE SECOND THREAD WILL EXECUTE AFTER -
//THE FIRST THREAD COMPLETS ITS EXECUTION 