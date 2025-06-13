public class HashCodeMethod {
    int i;
    HashCodeMethod(int i){
    this.i = i;
    }
    public String toString(){
        return i +"";
    }
    public int hashcode(){
    return i;    //HERE WE ARE OVERRIDING OBJECT CLASS HASHCODE METHOD
    }
    public static void main(String[] args) {
       HashCodeMethod h = new HashCodeMethod(10);
       System.out.println(h);
    }
}
