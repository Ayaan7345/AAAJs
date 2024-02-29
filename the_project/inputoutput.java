import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.regex.Pattern;

public class InputOutput {
   public static void main(String args[]) throws java.io.IOException {
      //input
      java.io.File file = new java.io.File("taskFiles.txt");
      Scanner fileReader = new Scanner(file);
      Scanner userInput = new Scanner(System.in);
      Pattern taskFormat = Pattern.compile("\\{(.*;){4}.*\\}");
      
      //Task properties
      String taskName = ""; //name of the task
      String taskCategory = ""; //What is the category of the task
      boolean taskComplete = false; //Mark if time is completed
      LocalDateTime taskStart = LocalDateTime.now(); //Set when the task will start
      LocalDateTime taskDuration = LocalDateTime.now(); //set the duration of the task
      
      while (fileReader.hasNext(taskFormat)) {
         String taskToken = fileReader.next(taskFormat);
         String[] taskAttributes = taskToken.substring(1, taskToken.length() - 1).split(";");
         taskName = taskAttributes[0];
         taskCategory = taskAttributes[1];
         taskComplete = Boolean.parseBoolean(taskAttributes[2]);
         taskStart = LocalDateTime.parse(taskAttributes[3]);
         taskDuration = LocalDateTime.parse(taskAttributes[4]);
      }
         
      System.out.print("Current name is " + taskName + "\nEnter new name:\n> ");
      taskName = userInput.nextLine();
      System.out.print("Current category is " + taskCategory + "\nEnter new category:\n> ");
      taskCategory = userInput.nextLine();
      System.out.print("Current task is " + (taskComplete ? "complete" : "incomplete") + "\nEnter true if complete:\n> ");
      taskComplete = userInput.nextBoolean();
      System.out.print("Starting time is " + taskStart + "\n");
      taskStart = LocalDateTime.now();
      System.out.print("Ending time is " + taskDuration + "\n");
      taskDuration = LocalDateTime.now();
      
      try (PrintWriter fileOutput = new java.io.PrintWriter(file)) {
         fileOutput.print("{" + taskName + ";" + taskCategory + ";" + taskComplete + ";" + taskStart + ";" + taskDuration + "}");
      }
   }
}