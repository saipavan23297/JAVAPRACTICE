import java.util.ArrayList;
import java.util.Collection;

public class Collectionex {
    public static void main(String a[]) {
          Collection<Integer> nums = new ArrayList<Integer>();
          nums.add(3);                                        
          nums.add(33);
          nums.add(24);
          nums.add(123);
          
          for(int n: nums){

              System.out.println(n);
          }
    }
}
