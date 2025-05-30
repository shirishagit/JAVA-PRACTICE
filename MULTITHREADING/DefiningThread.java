class ChildDefiningThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
          System.out.println("Child Thread");
        }
    }
}

public class DefiningThread {
   public static void main(String[] args){
    ChildDefiningThread t = new ChildDefiningThread();
    t.start();
    for(int i=0;i<10;i++){
        System.out.println("Parent thread");
    }
   }
    
}

// ABOVE CODE IS CALLED MULTI-THREADING 
//THREAD-BASED MULTITASKING  EXECUITING SEVERAL TASKS  SIMULTANEOUSLY WHERE EACH TASK IS A SEPERATE
//INDEPENDENT PART OF THE SAME PROGRAM IS CALLED THREAD-BASED MULTITASKING
// 
