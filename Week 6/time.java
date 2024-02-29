//import API's needed here:

import java.util.Scanner;

public class time {

     /*--------------------------------------------------------------------------------
     main method below: 
     includes access specifier - epublic - required for main, 
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
public static void main(String args[ ]) {
               //create any objects if needed (i.e. scanner for keyboard input)
               Scanner kbd = new Scanner(System.in)
               

              //declare data storage space (constants and variables)
              int iHours = 0;
              int iDays =       0;
              int iYears = 0;
              //get  input as required by program gspecifications
              System.out.print("how many hours")
              iHours = kbd.nextInt();
              

              //process data as required by program specifications
              iDays = iHours/24;
              iYears = iDays/365;
              iDays %= 365; 
              //display results as required by program specifications
              System.out.println(iYears);
              System.out.println(iDays);
              //This is a print statment in java it will print what ever is in the () as a string
            
				  
				  
         } // closing main method
} // closing class header