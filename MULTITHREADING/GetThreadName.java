class GetChildThreadName extends Thread{
    
}

public class GetThreadName {
    public static void main(String[] args) {
        GetChildThreadName t = new GetChildThreadName();
        System.out.println(t.getName());  //default thread name provided by jvm is thread-0
        System.out.println(Thread.currentThread().getName());// default name provided by jvm to mainthread is main
        Thread.currentThread().setName("9sai");
        System.out.println(Thread.currentThread().getName());// by this we can setname to thread as 9sai
    }
}


// THIS IS THE CODE FOR GET AND SET NAME FOR THREAD
//