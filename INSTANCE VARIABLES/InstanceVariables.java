public class InstanceVariables {
    
    int[] x ;
    public static void main(String[] args){
        InstanceVariables t = new InstanceVariables();
       System.out.println(t.x);
    
    }
    public void m1(){
        System.out.println(x);
    }


}


// THIS IS INSTANCE VARIABLE 
// IF THE VALUE OF A VARIABLE VARIED FROM OBJECT TO OBJECT SUCH TYPE OF VARIABLES ARE CALLED INSTANCE VARIABLES
// FOR EVERY OBJECT A SEPERATE COPY OF INSTANCE VARIABLE WILL BE CREATED
// WE SHOULD DECLEARE INSTANCE VARIABLES IN THE CLASS DIRECTLY 
// JVM WILL PROVIDE DEFALUT TO FOR INSTANCE VARIABLE WHICH IS "0"