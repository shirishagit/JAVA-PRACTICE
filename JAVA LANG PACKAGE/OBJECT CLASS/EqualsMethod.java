public class EqualsMethod {
       String name;
       int rollno;
    EqualsMethod(String name,int rollno){
        this.name = name;
        this.rollno = rollno;

    }
    public boolean equals(Object o){
        if(o instanceof EqualsMethod){
            EqualsMethod e = (EqualsMethod)o;
            if(name.equals(e.name)&& rollno==e.rollno){
            return true;
            }
            else{
                return false;
            }
        }
           return false;
    }
    public static void main(String[] args) {
        EqualsMethod e1 = new EqualsMethod("shirisha", 45);
        EqualsMethod e2 = new EqualsMethod("Anjali", 46);
        EqualsMethod e3 = new EqualsMethod("Ravithi", 47);
        EqualsMethod e4 = new EqualsMethod("shirisha", 45);
        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(e3));
        System.out.println(e1.equals(e4));

    }
}