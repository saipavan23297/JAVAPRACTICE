class A{
    public void show1(){
        System.out.println("in A Show");
    }
}
class B extends A{
    public void show2(){
        System.out.println("in B show");
    }

}

public class Upcastdowncast {
    public static void main(String a[]){
            A obj =(A) new B();     // upcasting, we dont need to mention explicity (A).
            obj.show1();
          //  obj.show2();    // show2() method will not work because obj is refered to class A.
          
          B obj1 =(B) obj;      // this is downcasting, (B) is placed there cause it wil refer that object created willl refer to class B
          
          obj1.show2();
    }
    
}
