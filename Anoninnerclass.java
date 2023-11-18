// Anonymous innerclass
// these are created within the object 
//    A obj = new A(){
//      Anonymous inner class creation
//    };
// it will override the class for which object has been created


class A{
    public void show(){
        System.out.println("in A show");
    }
}
public class Anoninnerclass {
    public static void main(String a[]){
        A obj = new A()
        {
            public void show()
            {
                System.out.println("in ANON show");
            }

        };
        obj.show();
    }
    
}
