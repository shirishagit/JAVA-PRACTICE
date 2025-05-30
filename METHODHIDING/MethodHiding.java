class parent {
    public  void p(){
        System.out.println("parent method");
    }
}

class child extends parent{
    public  void p(){
        System.out.println("child method");
    }
}

public class MethodHiding {

    public static void main(String[] args) {
        parent parentRef = new child();
        parentRef.p(); 
    }
}

//THE ABOVE METHOD IS CALLED METHODHIDING
//