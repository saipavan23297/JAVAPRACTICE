class Computer{
    public void playMusic(){
        System.out.println("Music playing ");
    }
    public String getmepen(int cost){
        if(cost>10)
        return "here is your pen";
        else
        return "Nothing";
    }
}


public class Methodexample
{
    public static void main (String a[])
    {
         Computer obj = new Computer();
         obj.playMusic();
         String str = obj.getmepen(10);
         System.out.println(str);
    }
}