class Calculate{
     public int add(int n1, int n2, int n3)
     {
        return n1+n2+n3;
     }
     public int add(int n1, int n2)
     {
        return n1+n2;
     }
}


public class Calculator {
    public static void main(String a[])
    {
        Calculate obj = new Calculate();
        int res = obj.add(3,4);
        System.out.println(res); 

    }
}

