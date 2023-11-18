// A  Class can implement multipe interfaces
// An interafce can extend into another interface

interface A{
    int age= 78;   
      // By default the variables declared in the interface are final and static
    void show();
    void config();
}

class B implements A{
    public void show(){
        System.out.println("ina B show");
    }
    public void config(){
        System.out.println("in configuring");
    }
}
public class Interfaceex {
    public static void main(String a[]){
            A obj;
            obj = new B();
            obj.show();
            obj.config();
            System.out.println(A.age);  // we dont need to create a object to A 
                                        //we call it by interface name

    }
    
}
