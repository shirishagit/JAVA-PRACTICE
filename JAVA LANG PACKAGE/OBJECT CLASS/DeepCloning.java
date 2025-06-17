class InnerReference1 {
    int j ;
    InnerReference1(int j){  // This is the inner reference variable of mainObject
    this.j= j;
    }
}
class MainObject1 implements Cloneable
{
    InnerReference1 i ;    //This is the mainOject of the object
    int x;       
    MainObject1(InnerReference1 i,int x ){
        this .i = i;
        this .x = x;
    }
    public Object Clone() throws CloneNotSupportedException
    {
       InnerReference1 i1 = new InnerReference1(i.j);
       MainObject1 m = new MainObject1 (i1, x);
       return m;  // overriding of object class clone() method
    }

}
public class DeepCloning {

    public static void main(String[] args) throws CloneNotSupportedException {
        InnerReference1 i = new InnerReference1(20);
        MainObject1 m1 = new MainObject1(i, 10);
        MainObject1 m2 = (MainObject1)m1.Clone();
        System.out.println(m1.x + "..." + m1.i.j);// 10 ... 20  
         m2.x = 888; 
         m2.i.j=999;
        System.out.println(m1.x + "..." + m1.i.j); // 10 .... 20
        System.out.println(m2.x + "..." + m2.i.j);
    }
}

// The above code is called deep cloning 
// In Deepcloning the object and the inner Reference variable also get cloned and a duplicate object wil be created
// It is only used in a few situatons only
