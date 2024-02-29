//import API's needed here:
import java.util.Scanner;

public class Driving 
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
               Scanner kaya = new Scanner(System.in);

              //declare data storage space (constants and variables)

              final float TANK = 9.3f;
              final float MPGC = 28.0f;
              final float MPGH = 36.0f;
              float dist;
              float cGas;
              int cSpeed;
              float dToE;
               

              //get  input as required by program specifications
              

              //process data as required by program specifications
              dist = (TANK/2 * MPGC) + (TANK/2 * MPGH);
              System.out.println("you drove this many miles " + dist );
              System.out.println(dist);
              dist = TANK * MPGC; 
              if(dist == 260.4F)
               {System.out.println("you drove in the city");
                }
         
              else
              {System.out.println("you drove in the highway");}

              System.out.println("Current Gas qty int tank");
              cGas = kaya.nextFloat();
              System.out.println("current speed");
              cSpeed = kaya.nextInt();
              if(cSpeed >= 55)
                dToE = cGas * MPGH;
              else
                dToE = cGas * MPGC;
              System.out.println("you have" + dToE + "miles left");


                
              
              //display results as required by program specifications
              
              //This is a print statment in java it will print what ever is in the () as a string
            
				  
				  
         } //closing main method
} //closing class header