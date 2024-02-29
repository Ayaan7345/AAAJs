
//import API's needed here:
import java.util.Scanner;

public class CostOfDriving {

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
                Scanner keyin = new Scanner(System.in);

                // declare data storage space (constants and variables)
                float dis;
                float fuelEf;
                float costGas;
                float userFf;
                float costD;

                // get input as required by program specifications
                System.out.print("Enter the distance to drive  ");
                dis = keyin.nextFloat();
                System.out.println("What is the fuel efficiency of your car in miles per gallon ");
                fuelEf = keyin.nextFloat();
                System.out.println("What is the price per gallon of gas");
                costGas = keyin.nextFloat();
                input.close();


                // process data as required by program specifications
                userFf = (dis / fuelEf);
                costD = (userFf*costGas);


                // display results as required by program specifications
                System.out.println("The cost of driving will be $"+ costD);

                // This is a print statment in java it will print what ever is in the () as a
                // string

        } // closing main method
} // closing class header