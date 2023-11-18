//every constructor in default has a super() method in default.
//Super method executes the constructor of super class
// this() method excetues the constructor of the same class
// we dont need to explicitly define it 
// when ever the object is created for any specific class consisting of a constructor then the super() method is get triggered in a constructor.
// after triggering the super() methood the execution will be moved to the super class caontaining constructor.
// after executing the super class it will be moved to the default constructor on which object is created.



class A{
    public A(){
        System.out.println("in a A");
    }
    public A(int n){
        System.out.println("in a A int");
    }

}
 class B extends A {
    public B(){
        System.out.println("in a B");
    }
    public B( int n){
       // super();
       //this();
       super(n);
        System.out.println("in a B int");
    }

 }

public class Thissuper {
    public static void main(String a[])
    {
        B obj =new B(5);

    }
}
