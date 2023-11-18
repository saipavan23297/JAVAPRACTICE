// by using static keyword in the method we  dont need to create a object to the class.
// to use the method we can call the method with the class name(classname.methodname) directly 
//dont have to create a object .


class Mobile
{
    String brand;
    int price;   // instance variable
    static String name; // static varaiable

    public void show(){
        System.out.println(brand+":"+price+":"+name);
    }
    public static void show1(Mobile obj){
        System.out.println("in a static method");
        System.out.println(obj.brand+":"+obj.price+":"+name);
    }
}

public class Staticexample {
    public static void main(String a[]){
        Mobile obj1 =new Mobile();
        obj1.brand = "iphone";
        obj1.price = 1900;
        obj1.name = "SmartPhone";
        Mobile obj2 = new Mobile();
        obj2.brand = "Vivo";
        obj2.price = 100;
        obj2.name = "SmartPhone";  //call class name (mobile.name)

        obj1.show();
        obj2.show();
        Mobile.show1(obj2);
    }
    
}
