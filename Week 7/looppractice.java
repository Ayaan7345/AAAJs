//import API's needed here:

public class looppractice {

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
    //create any objects if needed (i.e. scanner for keyboard input)

    //declare data storage space (constants and variables)

    // int i = 1

    //get  input as required by program specifications

    //process data as required by program specifications

    for (int i = 1; i <= 25; i += 2) System.out.print(
      i + (i == 25 ? "" : ", ")
    );
    //display results as required by program specifications

    //This is a print statment in java it will print what ever is in the () as a string

  } //closing main method
} //closing class header
