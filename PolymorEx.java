// polymorphism

class A{
    public void show()
    {
       System.out.println("in A show");
    }
}

class B extends A{
    public void show()
    { 
        System.out.println("in B show");
    }
}
class C extends A{
    public void show(){
        System.out.println("in C show");
    }
}

public class PolymorEx {
    public static void main(String a[]){

        A obj = new A();
        obj.show();

        obj = new B();  // same object is used agian 
        obj.show();

        obj = new C();      // same object is used again
        obj.show();

    }
    
}
