interface A{
    void show();

}

public class Lambdaex{                       // Lambda expressions works only with functional interafces
     public static void main(String a[])     // Functional interface is that it contains only one method
    {
      A obj = () -> System.out.println("in a Show");  //Lambda EXpression
      obj.show();                              //Aonnymous inner class
    }                                          
}


// when we have a return type 
 // public class Lambdaex{
    /*  interface A{
        int add(int a, int b);
    }
    public static void main(String a[]){
                A obj = (a, b) -> a+b ;      we dont need to mention return a+b explicitly by default it will be return in lambda expression
                int result = obj.add(3,34);
                System.out.println(result);

    }
 }*/