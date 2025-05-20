public class MainMethodTwo {
    public static void main(String[] args) {
        System.out.println("parent method");
    }
}
class InnerMainMethodTwo extends MainMethodTwo {

    public static void main(String[] args) {
        System.out.println("child main");
    }
}


//IN THE ABOVE CODE IS CALLED METHOD HIDING 
//THERE WILL BE TWO .CLASSES WILL BE CREATED 
//CLASS MAINMETHODTWO IS THE PARENT OF INNERMAINMETHODTWO