class Dog{
 private String name;
 private int age ;

 public void setName(String name){
    this.name= name;
 }
 public String getName(){
     return this.name;
 }

}

public class Thisexample {
    public static void main(String a[]){
        Dog obj = new Dog();
        obj.setName("sweety");

        System.out.println(obj.getName());
    }
    
}
