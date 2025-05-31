class Runnableclass implements Runnable{
    public void run(){
        System.out.println("Run method");
    } 
}

public class Myrunnable {
    public static void main(String[] args) {
        Runnableclass r = new Runnableclass();
        Thread t = new Thread(r);
        t.start();
        System.out.println("main thread");
    }
}


//ABOVE CODE IDS CALLED 2ND WAY OF DEFINING THREAD BY IMPLIMENTING RUNNABLE(INTERAFACE)
//THE RUNNABLE INTREFACE WILL ONLY CONTAIN EMPTY RUN METHOD 
//SO ME HAVE TO DEFINE ANOTHER THREAD AND PASS THE RUNNABLE R TO THREAD OBJECT PARAMETER
//THIS METHOD ID RECOMMANDED FOR MULTITHREADING
