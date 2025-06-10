public class NestedOuter {
    static class InnerNested {
       public static void main(){
        System.out.println("static nested classmethod");
       }    
    }
    public static void main(String[] args) {
        System.out.println("outer class method");
        
    }
}
