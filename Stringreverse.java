public class Stringreverse{
    public static void main(String a[]){
        String original = "saipavan";
        String reverse = " ";
        int i ;
        for(i=original.length()-1; i>=0; i--){
            reverse = reverse+original.charAt(i);
        }
        
        
        System.out.println(reverse);
    }
}