

class A{
    int age;
    public void show()
    {
        System.out.println("showing");
    }
    class B{                                           //inner class: class can be inside of another class
        public void dontshow(){                       //inner classes can be static but outer classes cant be static
            System.out.println("no showing");       //static class B{     this is static class
        }                                             //   .......           // method inside static class should be called like     
    }                                                 //  }                  //  A.B obj =  new A.B();
}
public class Innerclassex {
    public static void main(String a[]){
         A obj = new A();
         obj.show();
         //obj.dontshow();// we cant execute the inner class method just by creating main class object

         A.B obj1 = obj.new B();  //class B is inside class A so B should be called with A
                                  // obj here is Class A's object so we called obj.new B();
         obj1.dontshow();

    }
    
}
