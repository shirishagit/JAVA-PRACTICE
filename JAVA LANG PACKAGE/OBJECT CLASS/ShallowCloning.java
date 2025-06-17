class InnerReference {
    int j ;
    InnerReference(int j){  // This is the inner reference variable of mainObject
    this.j= j;
    }
}
class MainObject implements Cloneable
{
    InnerReference i ;    //This is the mainOject of the object
    int x;       
    MainObject(InnerReference i,int x ){
        this .i = i;
        this .x = x;
    }
    public Object Clone() throws CloneNotSupportedException
    {
       return  super.clone();    //There we are calling object call clone() method
    }

}
public class ShallowCloning {

    public static void main(String[] args) throws CloneNotSupportedException {
        InnerReference i = new InnerReference(20);
        MainObject m1 = new MainObject(i, 10);
        MainObject m2 = (MainObject)m1.Clone();
        System.out.println(m1.x + "..." + m1.i.j);  // 10...20
         m2.x = 888;
         m2.i.j=999;
        System.out.println(m1.x + "..." + m1.i.j); //10 ... 999
    }
}


// The above code is shallowcloning which is in the object class 
// If the object contain any reference variable the the clone() method does not duplicate that object
// It only clone the main Object and the cloned object will point to the old reference variable only
