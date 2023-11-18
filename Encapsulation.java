class Human{
     private int age = 11;
     private String name = "saipavan";
  public int getAge(){
    return age;
  }
  public String getName(){
    return name;
  }
}


public class Encapsulation {
    public static void main(String a[]){
        Human obj = new Human();
       
            System.out.println(obj.getAge() + " and my age is "+ obj.getName()); 
 
       
    }
    
}
