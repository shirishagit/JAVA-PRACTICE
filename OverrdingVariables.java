class parent{
    int x= 777;
}
class child extends parent  {
 int x =888;
    
}

public class OverrdingVariables {

  public static void main(String[] args) {
    parent p = new parent();
    System.out.println(p.x);
    parent p1 = new child();
    System.out.println(p1.x);
    child c = new child();
    System.out.println(c.x);
  }
}  