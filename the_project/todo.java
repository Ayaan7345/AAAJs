//import API's needed here:
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class todo {

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
    Scanner kbd = new Scanner(System.in);
    File file = new File("ToDoList");

    //declare data storage space (constants and variables)
    int menuOption;
    boolean timeConflict; //is there a conflict in your schedule
    boolean isTaskTimeInPast; //Is the task in the future
    double timeOnTask; //???????????????????????????????????????????????????????
    String tempNewTaskName; //Temporary new name for task
    int editMenuChoice; //choice in the edit menu
    String tempNewCategory; //Temporary new name for category

    //Date rightNow = new Date(); //The date now
    //Not implemented      Array taskList; //the main task list
    int deleteMenuChoice; //choice in the delete menu

    //Task properties
    String taskName; //name of the task
    String taskCategory; //What is the category of the task
    boolean taskComplete; //Mark if time is completed
    LocalDateTime taskStart; //Set when the task will start
    LocalDateTime taskDuration; //set the duration of the task

    //Start prompting to user
    System.out.print(
      "Welcome to our To-Do Application, please select a choice from below to continue\n"
    );
    System.out.print(
      "Main menu: \n1.Add Task\n2.Edit Task\n3.Delete Task\n4.Complete Task\n5.Save\n0.Exit"
    );
    System.out.print("\nEnter a choice from the menu and press Enter: ");
    menuOption = kbd.nextInt();

    while (menuOption < 0 || menuOption > 5) {
      System.out.println("---------------Invalid Choice---------------");
      System.out.print(
        "Main menu: \n1.Add Task\n2.Edit Task\n3.Delete Task\n4.Complete Task\n5.Save\n0.Exit"
      );
      System.out.print("\nEnter a choice from the menu and press Enter: ");
      menuOption = kbd.nextInt();
    }
    while (menuOption != 0) {
      if (menuOption == 1) {
        System.out.print("Enter a new task: ");
        kbd.nextLine();
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
        System.out.print("\nWhat would you like to edit?\n1. Edit Task Name\n2. Edit Task Category\n0. Return to Main menu");
        editMenuChoice = kbd.nextInt();

        while(editMenuChoice!=0){
        System.out.print("\nWhat would you like to edit?\n1. Edit Task Name\n2. Edit Task Category\n0. Return to Main menu");
        editMenuChoice = kbd.nextInt();

        if(editMenuChoice==1){
          //Prompt the task list
          System.out.print("Task: "+taskName+" Category: "+taskCategory);

          System.out.print("Enter the new task name: ");
          tempNewTaskName = kbd.nextLine();
        
        }
        }//editMenuChoice close
        //Prompt user for menuOption again since we are out of the editMenu
        System.out.print("Main menu: \n1.Add Task\n2.Edit Task\n3.Delete Task\n4.Complete Task\n5.Save\n0.Exit");
        System.out.print("\nEnter a choice from the menu and press Enter: ");
        menuOption = kbd.nextInt();
      }//close menuOption2

      if (menuOption == 0) {
        System.out.println("Good Bye!");
      } //close choice 0

    } //close main menuOption==0 while Loop
  } //closing main method
} //closing class header
