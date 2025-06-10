public class AnonymousClass3 {
    public static void main(String[] args) {
       new  Thread(new Runnable() {
        public void run(){
            for(int i =0;i<5;i++){
            System.out.println("child Class");
            }
            
        }
       }).start();
       
       System.out.println("Main Class");
    }
}
