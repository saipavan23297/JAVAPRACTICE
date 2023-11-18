//Anonnymous object dont contain reference 
// so it can not be used again 

class Anon{
    public Anon(){   //constructor
        System.out.println("object is created");
    }
    public void show(){
        System.out.println("in a show");
    }
}


public class Anonobject {
    public static void main(String a[]){
            //Anon obj = new Anon();  // normal object creation
            //obj.show(); // normal method calling
             new Anon();  // anonymous abject creation
             new Anon().show();  // if we want to call the method in the class
    }
    
}
