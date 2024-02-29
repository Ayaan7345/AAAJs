//import API's needed here:

import java.util.Scanner;

public class somthing
{  

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
public static void main(String args[ ]) 
        {
        
               //create any objects if needed (i.e. scanner for keyboard input)
               Scanner kbd = new Scanner(System.in);
               

              //declare data storage space (constants and variables)
              int iPennies = 0;
              int iNickels = 0;
              int iDimes = 0;
              int iQuarters = 0; 
              int iCents = 0; 
              int iDollars = 0;
              //get  input as required by program specifications
              System.out.print("Input # of pennys: ");
              iPennies = kbd.nextInt();
              System.out.print("Input # of nickels: ");
              iNickels = kbd.nextInt();
              System.out.print("Input # of dimes: ");
              iDimes = kbd.nextInt();
              System.out.print("Input # of quarters: ");
              iQuarters = kbd.nextInt();

              //declare data storage space (constants and variables)  
              iCents += iPennies;  
              iCents += iNickels * 5;  
              iCents += iDimes * 10;  
              iCents += iQuarters * 25;
              
              iDollars = iCents / 100;
              
              iCents %= 100;
        

              //get  input as required by program specifications

              //process data as required by program specifications

              //display results as required by program specifications
              
              System.out.println("$ " + iDollars + "." + iCents);
              
              //This is a print statment in java it will print what ever is in the () as a string
            
				  
				  
         } //closing main method
} //closing class header