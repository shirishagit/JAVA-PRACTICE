

class InnerReference {
    int j ;
    InnerReference(int j){
    this.j= j;
    }
}
class MainObject implements Cloneable
{
    InnerReference i ;
    int x;
    MainObject(InnerReference i,int x ){
        this .i = i;
        this .x = x;
    }
    public Object Clone() throws CloneNotSupportedException
    {
       return  super.clone();
    }

}
public class ShallowCloning {

    public static void main(String[] args) throws CloneNotSupportedException {
        InnerReference i = new InnerReference(20);
        MainObject m1 = new MainObject(i, 10);
        MainObject m2 = (MainObject)m1.Clone();
        System.out.println(m1.x + "..." + m1.i.j);
         m2.x = 888;
         m2.i.j=999;
        System.out.println(m1.x + "..." + m1.i.j);
    }
}
