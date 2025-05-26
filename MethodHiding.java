class parent {
    public static void p(){
        System.out.println("parent method");
    }
}

class child extends parent{
    public static void p(){
        System.out.println("child method");
    }
}

public class MethodHiding {

    public static void main(String[] args) {
      
         parent.p();
         child.p();
   
      
    }
}