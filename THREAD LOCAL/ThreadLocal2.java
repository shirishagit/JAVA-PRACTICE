//OVERRIDING OF INITIALVALUE METHOD OF THREADLOCAL


class ThreadLocal3  extends Thread {
    static Integer CoustId = 0;
    private static ThreadLocal<Integer> tl = new ThreadLocal<Integer>(){
        protected Integer initialValue(){
           return ++CoustId;
        }
    };
    ThreadLocal3(String name){
        super(name);
    }
    public void run(){
    System.out.println(Thread.currentThread().getName() + " Executed with custId : " + tl.get());
    }
    
}

public class ThreadLocal2 {

    public static void main(String[] args) {
        ThreadLocal3 t1 = new ThreadLocal3("customer Thread-1");
        ThreadLocal3 t2 = new ThreadLocal3("customer Thread-2");
        ThreadLocal3 t3 = new ThreadLocal3("customer Thread-3");
        ThreadLocal3 t4 = new ThreadLocal3("customer Thread-4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
