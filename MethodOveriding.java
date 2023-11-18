// Methodoverdidng
// if the sub class and super class have same methods, then the super class method is overided and sub class method gets executed


class A{                                    // super class
    public int add(int n1, int n2){
            return n1+n2;
    }
}
class B extends A{                          // sub class            
    public int add(int n1, int n2){
        return n1+n2+1;
    }
}

public class MethodOveriding {
    public static void main(String a[]){
        B obj = new B();
        int r1 = obj.add(1,3);
        System.out.println(r1);
    }
   
}
