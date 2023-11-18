//construcor is special type of method used to create objects
//every time we create a new object then the contructor is called
//even if we not created a constructor then the java will create in default constructor in the backend.
// the constructor is directly called soon after creating object without calling constructor unlike method should be called


 
class Human 
{
     int age;
     String name;

    public Human(){                // it is a constructor: class name will be constructor name;
        age = 12;
        name= "saipavan";
    }
    public Human(int a, String n)      // Parametrized Constuctor
    {       
        age = a;
        name = n;
    }
}
public class Constructorexample {
    public static void main(String a[]){

    Human obj = new Human();
    Human obj1 = new Human( 156,"jinger" );
    System.out.println("in a main method");
    System.out.println(obj.age + obj.name);
    System.out.println(obj1.age + obj1.name);
}   
}


