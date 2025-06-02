public class SleepThread  {
    public static void main(String[] args) throws InterruptedException{
        for(int i=1;i<=10;i++){
            System.out.println("slide :"+ i);
            Thread.sleep(2000);
        };

    }
}


// the sleep() method pause its execution for the mentioned milli seconds
// it runs after the time expires 