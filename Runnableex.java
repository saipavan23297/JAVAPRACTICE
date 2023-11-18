//class A implements Runnable{
//   public void run(){
//      for(int i = 0; i<=10; i++ ){
//         System.out.println("hihi");
//    }
//  }
//}
class B implements Runnable{                        // using normal class
    public void run(){
        for(int i = 0; i<=10; i++ ){
            System.out.println("hehehe");
        }
    }
}
public class Runnableex {
            public static void main(String a[]){          // runnable is a functional interface
            Runnable obj1 = () -> {                      // using lambda expressions 
                           
                           for(int i = 0; i<=10; i++ ){
                            System.out.println("hihi");
                       }
            };

            Runnable obj2 = new B();

            Thread t1 = new Thread (obj1);
            Thread t2 = new Thread (obj2);

            t1.start();
            t2.start();
    }
    
}
