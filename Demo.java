public class Demo {
    public void m1(){
        System.out.println("no-arg method");
    }
    public void m1(int i){
        System.out.println("int-i");
    }
    public void m1(double d){
        System.out.println("double d");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.m1();
        d.m1(10);
        d.m1(10.5);

    }
     
}