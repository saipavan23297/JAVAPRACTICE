class Calc{
    public int add(int n1, int n2){
        return n1+n2;
    }
     public int sub(int n1, int n2){
        return n1-n2;
    }
}
class AdvCalc extends Calc{                        //Single Inheritance
    public int multi(int n1, int n2){
        return n1*n2;
    }
    public int div(int n1, int n2){
        return n1/n2;
    }
}
class ScienCalc extends AdvCalc{                    //Multilevel Inheritance
    public double power(int  n1, int n2){
        return Math.pow(n1, n2);
    }
}


public class Inheritanceex {
    public static void main(String a[]){
            ScienCalc obj = new ScienCalc();
            int r1 = obj.add(1,2);
            int r2 =obj.sub(3,4);
            double r5 = obj.power(8,9);
            System.out.println(r1+ " "+ r2+" "+r5);
    }
}
