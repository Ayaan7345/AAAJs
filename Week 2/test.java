import javax.swing.JOptionPane;  // Needed for JOptionPane
import java.util.Scanner; // Needed for Scanner input

public class test {
    /*--------------------------------------------------------------------------------
    You need to create a phone menu prompt system for your fictitious company. There
    should be an intro phone message “ Hello you have reached ___________ Company…”
    (personalize this greeting for your company).
    Then, set up a phone menu prompt for 4-6 departments, with unique greeting messages
    for each department once a customer chooses a department. (ex. Press 1 for accounting.
    Accounting message: “Good Day, you have reached the accounting department, and we
    are very busy crunching numbers, please leave a message.”)
    First sort customer input prompt value data into valid (the range for the number of
    departments you set up) /invalid, and display an error message for all invalid entries, then
    process the valid data appropriately. Remember: phone value entries can be 0-9.
    
    Note: Make sure your prompts & displayed outcomes will be to the screen and should be
    user friendly. Input is from the keyboard.
    Assignment Specifications:
    Create a flowchart to solve this problem (flowchart must be submitted prior to coding)
    Then, using jGrasp:
    Code the problem in Java using if – else if - else branching method
    Submit your source code (.java file)
    Submit your output – Run for input 0-9 (saved in a notepad .txt file)
    (see syllabus for assignment grading details)
    ---------------------------------------------------------------------------------*/     
    public static void main(String args[ ]) {
        //create any objects if needed (i.e. scanner for keyboard input)
        Scanner scanner = new Scanner(System.in);

        //declare data storage space (constants and variables)

        //display results as required by program specifications
        JOptionPane.showMessageDialog(null, "Hello you have reached the AAAJ's Company");

        //get  input as required by program specifications
        // Prompt user to choose a department
        System.out.println("Please choose a department:");
        System.out.println("1. Junaid's Technical Support Team");
        System.out.println("2. Ayaan's Cybersecurity Team");
        System.out.println("3. Andrew's Customer Service Team");
        System.out.println("4. Alexis's Accounting Team");
        System.out.println("5. Shivam's Late Department");
        int choice = scanner.nextInt();

        if(choice < 1 || choice > 5) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please try again.");
        } else if (choice == 1) {
            JOptionPane.showMessageDialog(null, "Good Day, you have reached Junaid's Technical Support Team. How can we assist you?");
        } else if (choice == 2) {
            JOptionPane.showMessageDialog(null, "Welcome to Ayaan's Cybersecurity Team. How can we ensure your safety?");
        } else if (choice == 3) {
            JOptionPane.showMessageDialog(null, "Thank you for calling Andrew's Customer Service Team. Your satisfaction is our priority.");
        } else if (choice == 4) {
            JOptionPane.showMessageDialog(null, "You have reached Alexis's Accounting Team. Let's balance those books!");
        } else if (choice == 5) {
            JOptionPane.showMessageDialog(null, "Hello, this is Shivam's Late Department. We might not pick up now, but we'll definitely call you back...eventually.");
        }
                
        //process data as required by program specifications

        //This is a print statment in java it will print what ever is in the () as a string
    } //closing main method
} //closing class header
