
//import API's needed here:
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;
//import javafx.scene.control.Menu;
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
  public static void main(String args[]) throws java.io.IOException {
    // create any objects if needed (i.e. scanner for keyboard input)
    Scanner kbd = new Scanner(System.in);
    java.io.File file = new File("ToDoList.txt");
    /* Creating an object for OOP user.uinputmenu(prints out uinputmenu.java) */
    uinputmenu usher = new uinputmenu();

    // declare data storage space (constants and variables)
    int menuOption; // Main menu choice to move around the program
    boolean timeConflict; // is there a conflict iour schedule
    boolean isTaskTimeInPast; // Is the task in the future
    String tempNewTaskName; // Temporary new name for task
    int editMenuChoice; // choice in the edit menu
    String tempNewCategory; // Temporary new name for category
    final double PROMODORO = (25.0 * 60); // Time in seconds to count for the promodoro effect
    final double BREAKTIME = (5.0 * 60); // The ammount of time the user has to take a break from a task
    int taskToEdit;
    // Date rightNow = new Date(); //The date now
    String[][] taskList = new String[2][10]; // the main task list
    int numberOfTasks = 0;
    int deleteMenuChoice; // choice in the delete menu
    // Task properties
    String taskName = ""; // name of the task
    String task2Name = "";
    String taskCategory = ""; // What is the category of the task
    String task2Category = "";
    boolean taskComplete; // Mark if time is completed
    LocalDateTime taskStart; // Set when the task will start
    LocalDateTime taskDuration; // set the duration of the task
    int i = 0; // for loops

    // Ayaan is doing something dont touch
    // Start prompting to user
    if (file.exists()) {
      // -----------------------------read data from the file, store it in
      // memory--------------------------------
      Scanner fileReader = new Scanner(file);
      fileReader.next();
      taskName = fileReader.next();
      fileReader.next();
      taskCategory = fileReader.next();

      System.out.print("Welcome to our To-Do Application, please select a choice from below to continue\n");
      System.out.print(
          "Main menu: \n1.Add Task\n2.Edit Task\n3.Delete Task\n4.Complete Task\n5.Save\n6.Start Promodoro\n7.Print Tasks\n0.Exit");
      System.out.print("\nEnter a choice from the menu and press Enter: ");
      menuOption = kbd.nextInt();
    } // close file exists
    else {
      System.out.println(" .--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--. \n" + //
          "/ .. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\\n" + //
          "\\ \\/\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ \\/ /\n" + //
          " \\/ /`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'\\/ / \n" + //
          " / /\\                                                                    / /\\ \n" + //
          "/ /\\ \\                                                                  / /\\ \\\n" + //
          "\\ \\/ /          d8888        d8888        d8888 888888 d8b  .d8888b.    \\ \\/ /\n" + //
          " \\/ /          d88888       d88888       d88888   \"88b 88P d88P  Y88b    \\/ / \n" + //
          " / /\\         d88P888      d88P888      d88P888    888 8P  Y88b.         / /\\ \n" + //
          "/ /\\ \\       d88P 888     d88P 888     d88P 888    888 \"    \"Y888b.     / /\\ \\\n" + //
          "\\ \\/ /      d88P  888    d88P  888    d88P  888    888         \"Y88b.   \\ \\/ /\n" + //
          " \\/ /      d88P   888   d88P   888   d88P   888    888           \"888    \\/ / \n" + //
          " / /\\     d8888888888  d8888888888  d8888888888    88P     Y88b  d88P    / /\\ \n" + //
          "/ /\\ \\   d88P     888 d88P     888 d88P     888    888      \"Y8888P\"    / /\\ \\\n" + //
          "\\ \\/ /                                           .d88P                  \\ \\/ /\n" + //
          " \\/ /                                          .d88P\"                    \\/ / \n" + //
          " / /\\                                         888P\"                      / /\\ \n" + //
          "/ /\\ \\                                                                  / /\\ \\\n" + //
          "\\ \\/ /                                                                  \\ \\/ /\n" + //
          " \\/ /                                                                    \\/ / \n" + //
          " / /\\.--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--./ /\\ \n" + //
          "/ /\\ \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\/\\ \\\n" + //
          "\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `' /\n" + //
          " `--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--' ");
      System.out.println(
          "\nWelcome to the app, you will need to create a task for the application to function properly: Please follow the instructions");
      menuOption = 1;
    } // close else

    while (menuOption != 0 && menuOption <= 0) {
      System.out.print(menuOption);
      System.out.println("---------------Invalid Choice---------------");
      System.out.print(
          "Main menu: \n1.Add Task\n2.Edit Task\n3.Delete Task\n4.Complete Task\n5.Save\n6.Start Promodoro\n7.Print Tasks\n0.Exit");
      System.out.print("\nEnter a choice from the menu and press Enter: ");
      menuOption = kbd.nextInt();
    }
    while (menuOption != 0) {
      if (menuOption == 1) {
        // System.out.println("ADD TASK HAS NOT BEEN FULLY IMPLEMENTED, WILL REWORK ONCE
        // WE UNDERSTAND ARRAYS, WILL ONLY REPLACE ORIGINAL TASK");
        System.out.print("Enter a new task: ");
        // kbd.nextLine();
        taskName = kbd.nextLine();

        /*
         * while(timeConflict == false){
         * 
         * System.out.println("Enter a time to start format xxxxx: ");
         * //Not sure how to read a time taskStart = kbd.nextLine();
         * 
         * //while (taskStart < rightNow) -> Invalid, enter a time after the current
         * time
         * System.out.println("Enter a time to start format xxxxx: ");
         * taskStart = kbd.nextLine()
         * 
         * System.out.print("Enter time duration of the task, format \"xxxxx\": ");
         * //Not sure how to read time taskDuration = kbd.nextLine();
         * 
         * //Check if the time block is occupied by another block--
         * if(time block is occupied)
         * System.out.println("Time block is occupied")
         * timeConflict = false;
         * else
         * timeConflict = true
         * 
         * //
         * }//close while timeConflict
         */
        System.out.print("Enter task name: ");
        taskName = kbd.nextLine();

        System.out.print("Enter task category: ");
        taskCategory = kbd.nextLine();

        System.out
            .println("------------\nAdded Task: " + taskName + "\nTask category: " + taskCategory + "\n------------");
        taskComplete = false; // Will need the index for where in each task to store this

        // append Task to list;
        if (numberOfTasks > taskList.length) {
          String[][] tempArray = new String[2][taskList.length + 10];
          for (int j = 0; j < numberOfTasks; j++) {
            tempArray[0][j] = taskList[0][j];
            tempArray[1][j] = taskList[1][j];
          }
          taskList = tempArray;
        }
        taskList[0][numberOfTasks] = taskName;
        taskList[1][numberOfTasks] = taskCategory;
        numberOfTasks++;

        System.out.print(
            "Main menu: \n1.Add Task\n2.Edit Task\n3.Delete Task\n4.Complete Task\n5.Save\n6.Start Promodoro\n7.Print Tasks\n0.Exit");
        System.out.print("\nEnter a choice from the menu and press Enter: ");
        menuOption = kbd.nextInt();
      } // close choice 1

      else if (menuOption == 2) {

        // IF 2 IS SELECTED, PRINT THE TASKS
        // Prompt Edit Menu
        do {
          System.out.print(
              "\nWhat would you like to edit?\n1. Edit Task Name\n2. Edit Task Category\n0. Return to Main menu\nEnter a choice from the menu: ");
          editMenuChoice = kbd.nextInt();
          switch (editMenuChoice) {
            case 1: {

              // Prompt the task list
              for (int j = 0; j < numberOfTasks; j++) {
                System.out.println((j + 1) + ". Task: " + taskList[0][j] + "; Category: " + taskList[1][j]);
              }

              // ------------NEED MENU TO HAVE THEM PICK THE TASK------------
              System.out.print("Enter which task you would like to edit: ");
              taskToEdit = kbd.nextInt();

              kbd.nextLine();// This borks the program when you try to edit two things back to back

              if (0 < taskToEdit && taskToEdit <= numberOfTasks) {
                System.out.print("Enter the new task name: ");
                taskList[0][taskToEdit - 1] = kbd.nextLine();
              } // end of if
              else {
                System.out.print("\nNot a valid task option");
              } // end of else

              System.out.print(
                  "\nWhat would you like to edit?\n1. Edit Task Name\n2. Edit Task Category\n0. Return to Main menu\nEnter a choice from the menu: ");

              editMenuChoice = kbd.nextInt();

              break;
            } // case 1

            case 2: {
              // Prompt the task list
              for (int j = 0; j < numberOfTasks; j++) {
                System.out.println((j + 1) + ". Task: " + taskList[0][j] + "; Category: " + taskList[1][j]);
              }

              System.out.print("Enter which task you would like to edit: ");
              taskToEdit = kbd.nextInt();

              kbd.nextLine();// This borks the program when you try to edit two things back to back

              if (0 < taskToEdit && taskToEdit <= numberOfTasks) {
                System.out.print("Enter the new task name: ");
                taskList[1][taskToEdit - 1] = kbd.nextLine();
              } else {
                System.out.print("\nNot a valid task option");
              }

              System.out.print(
                  "\nWhat would you like to edit?\n1. Edit Task Name\n2. Edit Task Category\n0. Return to Main menu\nEnter a choice from the menu: ");
              editMenuChoice = kbd.nextInt();
              break;
            } // case 2 curly brace
            default: {
              System.out.println("-----Invalid Option-----");
              System.out.print(
                  "\nWhat would you like to edit?\n1. Edit Task Name\n2. Edit Task Category\n0. Return to Main menu\nEnter a choice from the menu: ");
              editMenuChoice = kbd.nextInt();
              break;
            }
          }// switch case close
        } while (editMenuChoice != 0);// editMenuChoice WHILE close
        // Prompt user for menuOption again since we are out of the editMenu
        System.out.print(
            "Main menu: \n1.Add Task\n2.Edit Task\n3.Delete Task\n4.Complete Task\n5.Save\n6.Start Promodoro\n7.Print Tasks\n0.Exit");
        System.out.print("\nEnter a choice from the menu and press Enter: ");
        menuOption = kbd.nextInt();
      } // close menuOption2 */

      else if (menuOption == 3) {
        System.out.println("----------Delete Task------------");

        for (int j = 0; j < numberOfTasks; j++) {
          System.out.println((j + 1) + ". Task: " + taskList[0][j] + "; Category: " + taskList[1][j]);
        }

        System.out.print("Enter which task you would like to delete: ");
        taskToEdit = kbd.nextInt();

        if (0 < taskToEdit && taskToEdit <= numberOfTasks) {
          for (int j = taskToEdit; j < numberOfTasks; j++) {
            taskList[0][j - 1] = taskList[0][j];
            taskList[1][j - 1] = taskList[1][j];
          }
          numberOfTasks--;
        } else {
          System.out.print("\nNot a valid task option");
        }

        System.out.print(
            "Main menu: \n1.Add Task\n2.Edit Task\n3.Delete Task\n4.Complete Task\n5.Save\n6.Start Promodoro\n7.Print Tasks\n0.Exit");
        System.out.print("\nEnter a choice from the menu and press Enter: ");
        menuOption = kbd.nextInt();
      }

      else if (menuOption == 4) {
        System.out.println("----------Complete a Task----------");
        System.out.print(
            "Main menu: \n1.Add Task\n2.Edit Task\n3.Delete Task\n4.Complete Task\n5.Save\n6.Start Promodoro\n7.Print Tasks\n0.Exit");
        System.out.print("\nEnter a choice from the menu and press Enter: ");
        menuOption = kbd.nextInt();
      }
   
      else if (menuOption == 5) {
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        // Suppose you have a 2D array of tasks and their categories called 'taskArray'
        for (int j = 0; j < numberOfTasks; j++) {
          output.println((j + 1) + ". Task: " + taskList[0][j] + "; Category: " + taskList[1][j]);
        }
       

        // Write each task and its category in the array to the file
        //for (String[] task : taskArray) {
        //  output.println("Task: " + task[0] + " Category: " + task[1]);
        //}
        output.close();

        System.out.println("------------Tasks Saved to File------------");
        System.out.print(
            "Main menu: \n1.Add Task\n2.Edit Task\n3.Delete Task\n4.Complete Task\n5.Save\n6.Start Promodoro\n7.Print Tasks\n0.Exit");
        System.out.print("\nEnter a choice from the menu and press Enter: ");
        menuOption = kbd.nextInt();
      }

      else if (menuOption == 6) {
        usher.menuUsher();
        System.out.println("------------Promodoro-------------");
        System.out.print(
            "Main menu: \n1.Add Task\n2.Edit Task\n3.Delete Task\n4.Complete Task\n5.Save\n6.Start Promodoro\n7.Print Tasks\n0.Exit");
        System.out.print("\nEnter a choice from the menu and press Enter: ");
        menuOption = kbd.nextInt();
      } else if (menuOption == 7) {
        System.out.println("-------------------------------------");
        for (int j = 0; j < numberOfTasks; j++) {
          System.out.println((j + 1) + ". Task: " + taskList[0][j] + "; Category: " + taskList[1][j]);
        }

        System.out.print(
            "Main menu: \n1.Add Task\n2.Edit Task\n3.Delete Task\n4.Complete Task\n5.Save\n6.Start Promodoro\n7.Print Tasks\n0.Exit");
        System.out.print("\nEnter a choice from the menu and press Enter: ");
        menuOption = kbd.nextInt();
      } else {// invalid option
        System.out.println("---------------Invalid Choice---------------");
        System.out.print(
            "Main menu: \n1.Add Task\n2.Edit Task\n3.Delete Task\n4.Complete Task\n5.Save\n6.Start Promodoro\n7.Print Tasks\n0.Exit");
        System.out.print("\nEnter a choice from the menu and press Enter: ");
        menuOption = kbd.nextInt();
      } // close else - invalid option

    } // close main menuOption==0 while Loop
  } // closing main method
} // closing class header
