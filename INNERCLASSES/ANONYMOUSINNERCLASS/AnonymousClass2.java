public class AnonymousClass2 {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("Anonymous class that implements an interaface child");
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
        }
    }

}
