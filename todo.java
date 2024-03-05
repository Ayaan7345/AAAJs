//import API's needed here:
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;
import javafx.scene.control.Menu;
import java.io.PrintWriter;

public class todo extends uinputmenu {

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
  public static void main(String args[]) throws java.io.IOException{
    //create any objects if needed (i.e. scanner for keyboard input)
    Scanner kbd = new Scanner(System.in);
    java.io.File file = new File("ToDoList.txt");
    uinputmenu usher = new uinputmenu();
    
  
    

    //declare data storage space (constants and variables)
    int menuOption; //Main menu choice to move around the program
    boolean timeConflict; //is there a conflict iour schedule
    boolean isTaskTimeInPast; //Is the task in the future
    String tempNewTaskName; //Temporary new name for task
    int editMenuChoice; //choice in the edit menu
    String tempNewCategory; //Temporary new name for category
    final double PROMODORO = (25.0*60); //Time in seconds to count for the promodoro effect 
    final double BREAKTIME = (5.0*60); //The ammount of time the user has to take a break from a task
  

    //Date rightNow = new Date(); //The date now
    //Not implemented      Aray taskList; //the main task list
    int deleteMenuChoice; //choice in the delete menu
    //Task properties
    String taskName=""; //name of the task
    String taskCategory=""; //What is the category of the task
    boolean taskComplete; //Mark if time is completed
    LocalDateTime taskStart; //Set when the task will start
    LocalDateTime taskDuration; //set the duration of the task

    //Ayaan is doing something dont touch 
    usher.menuUsher();
    //Start prompting to user
    if (file.exists()){
      //-----------------------------read data from the file, store it in memory--------------------------------
      Scanner fileReader = new Scanner(file);
      fileReader.next();
      taskName = fileReader.next();
      fileReader.next();
      taskCategory = fileReader.next();

      System.out.print("Welcome to our To-Do Application, please select a choice from below to continue\n");
      System.out.print("Main menu: \n1.Add Task\n2.Edit Task\n3.Delete Task\n4.Complete Task\n5.Save\n6.Start Promodoro\n0.Exit");
      System.out.print("\nEnter a choice from the menu and press Enter: ");
      menuOption = kbd.nextInt();
    }//close file exists
    else{
      System.out.println("Welcome to the app, you will need to create a task for the application to function properly: Please follow the instructions");
      menuOption=1;
    }//close else


    while (menuOption < 0 || menuOption > 6) {
      System.out.print(menuOption);
      System.out.println("---------------Invalid Choice---------------");
      System.out.print(
        "Main menu: \n1.Add Task\n2.Edit Task\n3.Delete Task\n4.Complete Task\n5.Save\n6.Promodoro\n0.Exit"
      );
      System.out.print("\nEnter a choice from the menu and press Enter: ");
      menuOption = kbd.nextInt();
    }
    while (menuOption != 0) {
      if (menuOption == 1) {
        System.out.print("Enter a new task: ");
        //kbd.nextLine();
        taskName = kbd.nextLine();

        /*while(timeConflict == false){
        
        System.out.println("Enter a time to start format xxxxx: ");
        //Not sure how to read a time taskStart = kbd.nextLine();

        //while (taskStart < rightNow) -> Invalid, enter a time after the current time
            System.out.println("Enter a time to start format xxxxx: ");
            taskStart = kbd.nextLine()
          
        System.out.print("Enter time duration of the task, format \"xxxxx\": ");
        //Not sure how to read time taskDuration = kbd.nextLine();
      
        //Check if the time block is occupied by another block--
          if(time block is occupied)
            System.out.println("Time block is occupied")
            timeConflict = false;
          else
            timeConflict = true

        //
        }//close while timeConflict*/
        System.out.print("Enter task category: ");
        taskCategory = kbd.nextLine();

        System.out.println("------------\nAdded Task: " + taskName + "\nTask category: " + taskCategory+"\n------------");
        taskComplete = false; //Will need the index for where in each task to store this

        //append Task to list;
        System.out.print("Main menu: \n1.Add Task\n2.Edit Task\n3.Delete Task\n4.Complete Task\n5.Save\n0.Exit");
        System.out.print("\nEnter a choice from the menu and press Enter: ");
        menuOption = kbd.nextInt();
      } //close choice 1

      if(menuOption==2){

        //IF 2 IS SELECTED, PRINT THE TASKS
        //Prompt Edit Menu 
        System.out.print("\nWhat would you like to edit?\n1. Edit Task Name\n2. Edit Task Category\n0. Return to Main menu\nEnter a choice from the menu: ");
        editMenuChoice = kbd.nextInt();
        while(editMenuChoice!=0){
          switch(editMenuChoice){
            case 1: {
              //Prompt the task list
              System.out.println("------Task: "+taskName+" Category: "+taskCategory+"------");
              //------------NEED MENU TO HAVE THEM PICK THE TASK------------
              kbd.nextLine();
              System.out.print("Enter the new task name: ");
              tempNewTaskName = kbd.nextLine();

              taskName = tempNewTaskName;

              System.out.print("\nWhat would you like to edit?\n1. Edit Task Name\n2. Edit Task Category\n0. Return to Main menu\nEnter a choice from the menu: ");

              editMenuChoice = kbd.nextInt();
              break;
            }//case 1
            case 2: {
              //Prompt the task list
            System.out.println("------Task: "+taskName+" Category: "+taskCategory+"------");
            //------------NEED MENU TO HAVE THEM PICK THE TASK------------
            kbd.nextLine();
            System.out.print("Enter the new task category: ");
            tempNewCategory = kbd.nextLine();

            taskCategory = tempNewCategory;

            System.out.print("\nWhat would you like to edit?\n1. Edit Task Name\n2. Edit Task Category\n0. Return to Main menu\nEnter a choice from the menu: ");
            editMenuChoice = kbd.nextInt(); 
            break;

            }//case 2 curly brace
            
          }//switch case close

        }//editMenuChoice WHILE close

        /*
        // Return to main menu if you dont want to edit a task
        while(editMenuChoice!=0){
          System.out.print("\nWhat would you like to edit?\n1. Edit Task Name\n2. Edit Task Category\n0. Return to Main menu");
          editMenuChoice = kbd.nextInt();

          if(editMenuChoice==1){
            //Prompt the task list
            System.out.print("Task: "+taskName+" Category: "+taskCategory);
            //------------NEED MENU TO HAVE THEM PICK THE TASK------------

            System.out.print("Enter the new task name: ");
            tempNewTaskName = kbd.nextLine();

            taskName = tempNewTaskName;

            System.out.print("\nWhat would you like to edit?\n1. Edit Task Name\n2. Edit Task Category\n0. Return to Main menu");
            editMenuChoice = kbd.nextInt();
          }//close editMenuChoice 1
          if(editMenuChoice == 2 ){
            
            //Prompt the task list
            System.out.print("Task: "+taskName+" Category: "+taskCategory);
            //------------NEED MENU TO HAVE THEM PICK THE TASK------------

            System.out.print("Enter the new task category: ");
            tempNewCategory = kbd.nextLine();

            System.out.print("\nWhat would you like to edit?\n1. Edit Task Name\n2. Edit Task Category\n0. Return to Main menu");
            editMenuChoice = kbd.nextInt();  
          }//close editMenuChoice 2

        }//editMenuChoice WHILE close
        */

        //Prompt user for menuOption again since we are out of the editMenu
        System.out.print("Main menu: \n1.Add Task\n2.Edit Task\n3.Delete Task\n4.Complete Task\n5.Save\n0.Exit");
        System.out.print("\nEnter a choice from the menu and press Enter: ");
        menuOption = kbd.nextInt();
      }//close menuOption2

      if (menuOption == 3){
        System.out.println("----------Delete Task------------");
      
        System.out.print("Main menu: \n1.Add Task\n2.Edit Task\n3.Delete Task\n4.Complete Task\n5.Save\n0.Exit");
        System.out.print("\nEnter a choice from the menu and press Enter: ");
        menuOption = kbd.nextInt();
      }
      
      if (menuOption == 4){
        System.out.println("----------Complete a Task----------");
        System.out.print("Main menu: \n1.Add Task\n2.Edit Task\n3.Delete Task\n4.Complete Task\n5.Save\n0.Exit");
        System.out.print("\nEnter a choice from the menu and press Enter: ");
        menuOption = kbd.nextInt();
      }

      if(menuOption == 5){
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        output.print("Task: "+taskName+" Category: "+taskCategory);
        output.close();

        System.out.println("------------Tasks Saved to File------------");
        System.out.print("Main menu: \n1.Add Task\n2.Edit Task\n3.Delete Task\n4.Complete Task\n5.Save\n0.Exit");
        System.out.print("\nEnter a choice from the menu and press Enter: ");
        menuOption = kbd.nextInt();

      }


      if(menuOption == 6){
        usher.menuUsher();
        System.out.println("------------Promodoro-------------");
        System.out.print("Main menu: \n1.Add Task\n2.Edit Task\n3.Delete Task\n4.Complete Task\n5.Save\n0.Exit");
        System.out.print("\nEnter a choice from the menu and press Enter: ");
        menuOption = kbd.nextInt();
      }
      if (menuOption == 0) {
        System.out.println("Good Bye!");
      } //close choice 0

    } //close main menuOption==0 while Loop
  } //closing main method
} //closing class header
