
 class MainOverriding {
    public void indemandSkill(){
        System.out.println("java");
    }
}
class InnerOverriding extends MainOverriding {

    public void indemandSkill(){
        System.out.println("python");
    }

}

public class Overriding{
   
    public static void main(String[] args) {
        MainOverriding o = new MainOverriding();
        o.indemandSkill();
        InnerOverriding i = new InnerOverriding();
        i.indemandSkill();
        
    }
    
}
