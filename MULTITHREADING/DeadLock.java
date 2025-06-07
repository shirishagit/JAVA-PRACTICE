class ChildA {
    public synchronized void d1(ChildB b){
        System.out.println("Thread 1 starts execution of d1() method");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {}
            System.out.println("thread1 trying to call As last() method");
           b.last();
        }
        public synchronized void last(){
                  System.out.println("inside ChildA his is last method");
        }
    
}

class ChildB{
        public synchronized void d2(ChildA a){
        System.out.println("Thread 2 starts execution of d2() method");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {}
            System.out.println("thread2 trying to call bs last() method");
           a.last();
        }
        public synchronized void last(){
                  System.out.println("inside ChildB this is last method");
        }
}

public class DeadLock extends Thread{
      ChildA a = new ChildA();
      ChildB b = new ChildB();
      public void m1(){
        this.start();
        a.d1(b);
      }
      public void run(){
        b.d2(a);
      }
      public static void main(String[] args) {
        DeadLock d = new DeadLock();
        d.m1();
      }
}

//In the above code we can observer deadlock situation 
//This is due to Synchronized keyWord
//If we remove atleast one synchronized key word the code executes fine 
//the situation where both threads waits for each foe ever is called deadLock situation.
