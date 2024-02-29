
//import API's needed here:
import java.util.Scanner;

public class PaintCeiling {

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
                Scanner Kevin = new Scanner(System.in);

                // declare data storage space (constants and variables)
                float len;
                float wid;
                float area;

                // get input as required by program specifications
                System.out.print("What is the length of the room in feet?");
                len = Kevin.nextFloat();
                System.out.print("What is the width of the room? in feet?");
                wid = Kevin.nextFloat();
                Kevin.close();
                // process data as required by program specifications

                area = len * wid;

                // display results as required by program specifications
                System.out.println("The area of your ceiling (or floor) is: " + area + " feet squared" );
               

        } // closing main method
} // closing class header