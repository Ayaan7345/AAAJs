
//import API's needed here:
import java.util.Scanner;

public class CarpetCalculator {

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
        Scanner scanner = new Scanner(System.in);

        // declare data storage space (constants and variables)
        float width, length, sqFoot, linearFeet;

        // get input as required by program specifications
        System.out.print("Enter the width of the room in feet and fractions of a foot: ");
        width = scanner.nextFloat();

        System.out.print("Enter the length of the room in feet and fractions of a foot: ");
        length = scanner.nextFloat();

        // process data as required by program specifications
        // Calculate the square footage needed and round up
        sqFoot = (int) Math.ceil(width * length);
        linearFeet = sqFoot / 10;

        // display results as required by program specifications
        System.out.println("The square feet of the room is about " + sqFoot + " you have to buy " + linearFeet
                + " feet of carpet that has the with of 10 feet from the store");

    } // closing main method
} // closing class header
