public class Stringexample {
    public static void main(String a[]){
       // String name= new String("saipavan");
        //System.out.println(name);
        //System.out.println(name.charAt(1));
         //System.out.println(name.concat("kolasani"));
     StringBuffer sb = new StringBuffer("saipavan");
     
     System.out.println(sb);
     System.out.println(sb.append("kolasani"));
     System.out.println(sb.length()); 

    System.out.println(sb.deleteCharAt(3));
    }
    
}
