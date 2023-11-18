// Abstrct class 
// abstract method can only be created within the abstract class
// but there can be any type of methods in abstract class
// abstract class is basically used when the method implemention unknown.
// abstact method should be defined in the subclass that inherited the abstract class
// if not defined then the code will give errors

abstract class Car{                 //Abstract class
    public abstract void drive();
    public abstract void fly();
    
    public void PlayMusic(){
        System.out.println("playing music");
    }
    public void brake(){
        System.out.println("Braking");
    }
}
class Audi extends Car{                 //concrete class
        public void drive(){
            System.out.println("in a driving");
        }
        public void fly(){
            System.out.println("in a Flying ");
        }
}


public class Abstractex {
    public static void main(String a[]){
         Audi obj = new Audi();
            obj.drive();
            obj.PlayMusic();
            obj.fly();
            obj.brake();
    }
    
}
