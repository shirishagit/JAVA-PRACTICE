import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable{
    String name;
    PrintJob(String name){
        this.name= name;
    }
    public void run(){
        System.out.println(name+ "...job started by thread" + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (Exception e) {}
        System.out.println(name + "..job completed by Thread" + Thread.currentThread().getName());
    }
}

public class Threadpool {
    public static void main(String[] args) {
        PrintJob[] jobs = { new PrintJob("Shirisha"),
                        new PrintJob("Nine sai"),
                        new PrintJob("Anjali"),
                        new PrintJob("Ravi Teja")

        };
         ExecutorService service = Executors.newFixedThreadPool(4);

         for (PrintJob job : jobs) {
            service.submit(job);
         }
         service.shutdown();
    }
    
}
