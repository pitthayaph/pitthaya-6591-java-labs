package phuengsujarit.pitthaya.lab2;

public class CamelCaseNaming {
    public static void main(String[] args) {
        /*check lengrh of agruments
         * and defined firstname and lastname
         */
        if(args.length == 2){
            String firstname = args[0];
            String lastname = args[1];
            String afterfirstname = firstname.substring(0, 1).toUpperCase() + firstname.substring(1).toLowerCase();
            String afterlastname = lastname.substring(0, 1).toUpperCase() + lastname.substring(1).toLowerCase();
            System.out.println("Camel Case Result: "+ afterfirstname + afterlastname);
        }/*defined errorcase */
        else {
            System.err.println("Error: Please provide exactly two arguments.");
        }
    }

}
    

