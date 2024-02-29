//import API's needed here:


public class MinntesLeft
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

              //declare data storage space (constants and variables)
              int minutes = 50; 
              int hours = 10;
              int days = 23-1;
              int totalMin;   

              //get  input as required by program specifications

              //process data as required by program specifications
              totalMin = minutes;
              totalMin = totalMin + (hours * 60);
              totalMin = totalMin + (days * 24 * 60);
              

              //display results as required by program specifications
              System.out.println("The number of minutes left are: " + totalMin );
				  
				  
         } //closing main method
} //closing class header