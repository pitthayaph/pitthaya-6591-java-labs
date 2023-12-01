package phuengsujarit.pitthaya.lab2;

public class SimpleCalculator {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        

    
    if (args.length !=3){
        System.err.println("Error: Please provide exactly three arguments.");
    }
         else if (args[2].equals("-")){
            System.out.println(a+"-"+b+"="+(a-b));
        }
         else if (args[2].equals("x")){
            System.out.println(a+"x"+b+"="+(a*b));
        }

               
        else if (args[2].equals("+")){
            System.out.println(a+"+"+b+"="+(a+b));
        }
       else if (args[2].equals("/")){
        if (b == 0)   {
            System.out.println("Error: Devision by zero is not allowed.");
        
        }else{
            System.out.println(a+"/"+b+"="+(a/b));
        }
    }
       else if (!(args[2].equals("+") || args[2].equals("-") || args[2].equals("x") || args[2].equals("/") )){
            
            System.out.println("Error: Invalid operator. Please use '+','-','x' or '/'");
        }
        
    
        
        
     }
}

  
        
    

