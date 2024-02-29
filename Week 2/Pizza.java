
//import API's needed here:
import java.lang.Math;

public class Pizza {

    /*--------------------------------------------------------------------------------
    main method below: 
    includes access specifier - public - required for main, 
    (other access specifier options: private & protected)
    static (does not require an instance of the class to be created 
    for method to run ) , 
    return type: "void" (means the method will not return a value ), 
    method identifier: "main" 
    (all apps must have one main method, 
    as it marks the start/entry point of the program when executed), 
    arguments/parameters: ( ) data to be sent to the method - 
    (more details when methods are covered)
    ---------------------------------------------------------------------------------*/
    public static void main(String args[]) {
        // create any objects if needed (i.e. scanner for keyboard input)

        // declare data storage space (constants and variables)
        // Small Pizza
        int smPizza = 7;
        // Large Pizza
        int lgPizza = 14;
        // Exponent
        int b2 = 2;
        double asmPizza;
        double algPizza;
        double adifflgsm;
        double shlgpizza;

        // get input as required by program specifications

        // process data as required by program specifications
        // Area Small Pizza
        asmPizza = (2 * (Math.PI * (Math.pow((smPizza / 2.0), b2))));
        // Area Large Piza
        algPizza = Math.PI * (Math.pow(lgPizza / 2.0, b2));
        // Difference between the areas
        adifflgsm = (algPizza - (asmPizza / 2));
        // Sharing the pizza with 5 friends how much do I get to eat
        shlgpizza = (algPizza / 6);

        // display results as required by program specifications
        System.out.println("The Area of the two 7 inch pizza will be " + asmPizza + " square inches");
        System.out.println("The Area of the 14 inch  pizza will be " + algPizza + " square inches");
        System.out.println("The difference in Area between both pizzas is " + adifflgsm + " square inches");
        System.out.println("You will be able to eat about " + shlgpizza + " inches squared of pizza");

        // This is a print statment in java it will print what ever is in the () as a
        // string

    } // closing main method
} // closing class header