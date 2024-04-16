
//import API's needed here:
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;
//import javafx.scene.control.Menu;
import java.io.PrintWriter;

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
    final double PROMODORO = (25.0 * 60); // Time in seconds to count for the promodoro effect
    final double BREAKTIME = (5.0 * 60); // The ammount of time the user has to take a break from a task
    // Date rightNow = new Date(); //The date now
    String[][] taskList = new String[2][10]; // the main task list
    int numberOfTasks = 0;
    // Task properties
    String taskName = ""; // name of the task
    String taskCategory = ""; // What is the category of the task
    boolean taskComplete; // Mark if time is completed
    LocalDateTime taskStart; // Set when the task will start
    LocalDateTime taskDuration; // set the duration of the task
    int i = 0; // for loops

    // Ayaan is doing something dont touch
    // Start prompting to user
    if (file.exists()) {
      taskList = readTasks(file);
      numberOfTasks = taskList[0].length - 10;
      
      System.out.print("Welcome to our To-Do Application, please select a choice from below to continue\n");
      
      menuOption = promptMenuOption();
       // close file exists
    } else {
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
      
      menuOption = promptMenuOption();
    }
    while (menuOption != 0) {
      if (menuOption == 1) {
        // System.out.println("ADD TASK HAS NOT BEEN FULLY IMPLEMENTED, WILL REWORK ONCE
        // WE UNDERSTAND ARRAYS, WILL ONLY REPLACE ORIGINAL TASK");
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
        System.out.println("----------Add Task------------");

        taskList = addTask(taskList, numberOfTasks);
        numberOfTasks++;

        menuOption = promptMenuOption();
      } // close choice 1

      else if (menuOption == 2) {
        System.out.println("----------Edit Task------------");
        
        // Prompt Edit Menu
        editTask(taskList, numberOfTasks);

        // Prompt user for menuOption again since we are out of the editMenu
        menuOption = promptMenuOption();
      } // close menuOption2 */

      else if (menuOption == 3) {
        System.out.println("----------Delete Task------------");

        if (deleteTask(taskList, numberOfTasks)) {
          numberOfTasks--;
        }

        menuOption = promptMenuOption();
      }

      else if (menuOption == 4) {
        System.out.println("----------Complete a Task----------");
        
        menuOption = promptMenuOption();
      }
   
      else if (menuOption == 5) {
        saveTasks(taskList, numberOfTasks, file);

        System.out.println("------------Tasks Saved to File------------");

        menuOption = promptMenuOption();
      }

      else if (menuOption == 6) {
        System.out.println("------------Promodoro-------------");
        
        menuOption = promptMenuOption();
      } 
      
      else if (menuOption == 7) {
        System.out.println("-------------------------------------");
        System.out.println("Number of tasks: " + numberOfTasks);
        displayTasks(taskList, numberOfTasks);
        
        menuOption = promptMenuOption();
      } else {
        // invalid option
        System.out.println("---------------Invalid Choice---------------");
        menuOption = promptMenuOption();
      } // close else - invalid option

    } // close main menuOption==0 while Loop
  } // closing main method

  /**
  * Prompts the user to choose a menu option
  *
  * @return an int associated with the menu they want to enter
  */
  public static int promptMenuOption() {
    Scanner kbd = new Scanner(System.in);
    int menuOption = -1;

    System.out.print(
      "-----Main Menu:-----\n1.Add Task\n2.Edit Task\n3.Delete Task\n4.Complete Task\n5.Save\n6.Start Promodoro\n7.Print Tasks\n0.Exit");
    System.out.print("\nEnter a choice from the menu and press enter: ");
    
    menuOption = kbd.nextInt();
    kbd.nextLine();

    return menuOption;
  }

  
  /**
  * Displays a numbered list of each task, including name and category
  *
  * @param  taskList      A 2d String array; the 1st array contains names and the 2nd array contains categories
  * @param  numberOfTasks The number of tasks in the array
  */
  public static void displayTasks(String[][] taskList, int numberOfTasks) {
    for (int i = 0; i < numberOfTasks; i++) {
      System.out.println((i+1) + ". Task: " + taskList[0][i] + "; Category: " + taskList[1][i]);
    }
  }

  /**
  * Prompts the user to choose a task
  * If the user chooses outside the range, they are prompted again
  *
  * @param  taskList      A 2d String array; the 1st array contains names and the 2nd array contains categories
  * @param  numberOfTasks The number of tasks in the array
  * @return               The index of the chosen task, starting at 0
  */
  public static int promptTask(String[][] taskList, int numberOfTasks) {
    Scanner kbd = new Scanner(System.in);
    int taskIndex = -1;

    displayTasks(taskList, numberOfTasks);

    System.out.print("Select a task: ");
    taskIndex = kbd.nextInt();

    while (0 >= taskIndex || taskIndex > numberOfTasks) {
      System.out.print("Not a valid task option");
      System.out.print("\nSelect a task: ");
      taskIndex = kbd.nextInt();
    }

    kbd.nextLine();

    return taskIndex - 1;
  }

  /**
  * Adds a task
  * Prompts the user for the name and category
  * If there is no room in the array, it will create a new copy of the array with 10 more entries
  *
  * @param  taskList      A 2d String array; the 1st array contains names and the 2nd array contains categories
  * @param  numberOfTasks The number of tasks in the array
  * @return               The updated array, or the new expanded copy of the array 
  */
  public static String[][] addTask(String[][] taskList, int numberOfTasks) {
    Scanner kbd = new Scanner(System.in);
    String taskName = "";
    String taskCategory = "";

    System.out.print("Enter task name: ");
    taskName = kbd.nextLine();

    System.out.print("Enter task category: ");
    taskCategory = kbd.nextLine();

    System.out.println("------------\nAdded Task: " + taskName + "\nTask category: " + taskCategory + "\n------------");

    //Expand array if it's too small
    if (numberOfTasks > taskList.length) {
      String[][] tempArray = new String[2][taskList.length + 10];
      for (int i = 0; i < numberOfTasks; i++) {
        tempArray[0][i] = taskList[0][i];
        tempArray[1][i] = taskList[1][i];
      }
      taskList = tempArray;
    }

    // append Task to list
    taskList[0][numberOfTasks] = taskName;
    taskList[1][numberOfTasks] = taskCategory;

    return taskList;
  }

  /**
  * Edits a task
  * Prompts the user to choose what property to edit
  * Prompts the user to choose what task to edit
  * Prompts the user for the new property
  * Allows the user to make any number of edits
  *
  * @param  taskList      A 2d String array; the 1st array contains names and the 2nd array contains categories
  * @param  numberOfTasks The number of tasks in the array
  */
  public static void editTask(String[][] taskList, int numberOfTasks) {
    int editMenuChoice = 0;
    int taskToEdit = -1;
    Scanner kbd = new Scanner(System.in);

    do {
      // Prompt Edit Menu
      System.out.print(
          "\nWhat would you like to edit?\n1. Edit Task Name\n2. Edit Task Category\n0. Return to Main menu\nEnter a choice from the menu: ");
      editMenuChoice = kbd.nextInt();
      kbd.nextLine();

      switch (editMenuChoice) {
        case 0:
          // Do nothing
          break;

        case 1:
          // Prompt the task list
          taskToEdit = promptTask(taskList, numberOfTasks);
          System.out.print("Enter the new task name: ");
          taskList[0][taskToEdit] = kbd.nextLine();
        break;

        case 2:
          // Prompt the task list
          taskToEdit = promptTask(taskList, numberOfTasks);
          System.out.print("Enter the new task category: ");
          taskList[1][taskToEdit] = kbd.nextLine();
          break;
        
        default:
          System.out.println("-----Invalid Option-----");
      }
    } while (editMenuChoice != 0);// editMenuChoice WHILE close
  }

  /**
  * Deletes a task
  * Prompts the user to choose what task to delete
  * Fills any holes in the array
  *
  * @param  taskList      A 2d String array; the 1st array contains names and the 2nd array contains categories
  * @param  numberOfTasks The number of tasks in the array
  * @return               True if a task was successfully deleted, false otherwise
  */
  public static boolean deleteTask(String[][] taskList, int numberOfTasks) {
    Scanner kbd = new Scanner(System.in);
    boolean taskDeleted = false;
    int taskToDelete = -1;

    taskToDelete = promptTask(taskList, numberOfTasks);
    
    for (int i = taskToDelete; i + 1 < numberOfTasks; i++) {
      taskList[0][i] = taskList[0][i + 1];
      taskList[1][i] = taskList[1][i + 1];
    }

    taskDeleted = true;

    return taskDeleted;
  }

  /**
  * Saves a list of tasks to a file
  *
  * @param  taskList      A 2d String array; the 1st array contains names and the 2nd array contains categories
  * @param  numberOfTasks The number of tasks in the array
  * @param  taskFile      The file to write to
  */
  public static void saveTasks(String[][] taskList, int numberOfTasks, File taskFile) throws java.io.IOException {
    java.io.PrintWriter output = new java.io.PrintWriter(taskFile);

    output.println("# of tasks: " + numberOfTasks);

    // Suppose you have a 2D array of tasks and their categories called 'taskArray'
    for (int i = 0; i < numberOfTasks; i++) {
      output.println((i + 1) + ". Task: " + taskList[0][i] + " Category: " + taskList[1][i]);
    }

    // Write each task and its category in the array to the file
    //for (String[] task : taskArray) {
    //  output.println("Task: " + task[0] + " Category: " + task[1]);
    //}
    
    output.close();
  }

  /**
  * Reads a list of tasks from a file
  *
  * @param  taskFile  The file to read the tasks from to
  * @return           A 2d array containing the tasks from the file
  */
  public static String[][] readTasks(File taskFile) throws java.io.IOException {
    //-----read data from the file, store it in memory-----
    Scanner fileReader = new Scanner(taskFile);
    int numberOfTasks = 0;
    int index = 0;
    String taskName = "";
    String taskCategory = "";

    fileReader.next();// Skip #
    fileReader.next();// Skip of
    fileReader.next();// Skip tasks:
    numberOfTasks = Integer.parseInt(fileReader.next());

    String[][] taskList = new String[2][numberOfTasks + 10];

    do {
      fileReader.next();// Skip the number
      fileReader.next();//Skip the *Task:* label
      taskName = fileReader.next();//Store the task name
      fileReader.next();// Skip the *Category:* Label
      taskCategory = fileReader.next();//Store the task Category
      // SPACES BETWEEN NAMES WILL COMPLETELY BREAK THE PROGRAM - NEED A DELIMITER

      taskList[0][index] = taskName;//Add Task Name to index i
      taskList[1][index] = taskCategory; //Add Category to index i
      index++;
    } while (fileReader.hasNext()); //while the file still has lines

    return taskList;
  }
} // closing class header
