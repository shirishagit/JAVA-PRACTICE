package VARIABLES;

public class InstanceVariables {
    int x =10;
    public static void main(String[] args){
        InstanceVariables t = new InstanceVariables();
       System.out.println(t.x);
      

    }
    public void m1(){
        System.out.println(x);
    }
}

//HERE IS THE EXAMPLES FOR INSTANCE- VARIABLES
//IF THE VALUE OF OBJECT VARY FROM OBJECT TO OBJECT SUCH TYPE OF OBJECT IS CALLED INSTANCE VARIABLES
//THE INSTANCE VARIABLE SHOULD BE DECLEARED IN THE BOLCK OF SCOPE  WHICH MEANS OUT SIDE THE METHOD 
//AND WE SHOULD CREATE AN OBJECT TO PRINT THE VALUE OF INSTANCE VARIABLE