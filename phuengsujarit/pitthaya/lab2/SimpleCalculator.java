package phuengsujarit.pitthaya.lab2;

public class SimpleCalculator {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        

    
    if (args.length !=3)
     {   System.err.println("Please provide exactly three arguments.");

        

    }
      else if (args[2].equals("x")) {
        System.out.println(args[0]+ "x" + args[1] + args[0]*args[1]);


      }

    }
}
