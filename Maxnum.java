public class Maxnum {
    public static void main(String a[]){
        int[] num = new int []{189,2,39,44,5,22,23};
        int max= num[0];
        
        for(int i=0; i<num.length; i++){
                if(max<num[i]){
                    max=num[i];
                }
        }
        System.out.println(max);
          
    }
}
