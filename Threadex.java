class A extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("hi");
            
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i =1; i<=5; i++){
            System.out.println("Hello World");
        }
    }
}
public class Threadex {
    public static void main(String a[]){
        A obj = new A();
        B obj1 = new B();
            obj.start();
            obj1.start();
    }
    
}
