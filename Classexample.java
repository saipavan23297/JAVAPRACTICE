class Calculator{
    int a = 0;
    public int add(int n1, int n2)
    {
        int r = n1+n2;
        return r;
    }
}

public class Classexample {
    public static void main(String a[]){
        int i =9;
        int j = 8;

        Calculator calc = new Calculator();

       int res = calc.add(i, j);
       System.out.println(res);
       // System.out.println(i+j);
    }
}
