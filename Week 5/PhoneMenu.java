
/*CS200----------------------------------------------------------------------
Semester: Spring
Year: 2024
Instructor: F.Porps
Your Name: Junaid, Ayaan
Lab/Assignment # :4 
Due: 02/15/2024
File name: PhoneMenu.java
---------------------------------------------------------------------------------*/
//import API's needed here:
import javax.swing.JOptionPane; // Needed for the window output

public class PhoneMenu {
    public static void main(String args[]) {

        // declare data storage space (constants and variables)
        // Convert user input to integer
        String departmentChoice;
        // User input opiton 
        int choice;
        // This is the opening message
        JOptionPane.showMessageDialog(null, "Hello you have reached the AAAJ's Company");

        // Prompt user to choose a department
        departmentChoice = JOptionPane.showInputDialog("Please choose a department:\n" +
                "1. Junaid's Techincal Support Team\n" +
                "2. Ayaan's Cybersecurity Team\n" +
                "3. Andrew's Customer Service Team\n" +
                "4. Alexis's Accounting Team\n" +
                "5. Shivam's Late Department\n");

       choice = Integer.parseInt(departmentChoice);
       
  
        if (choice < 1 || choice > 5)
            JOptionPane.showMessageDialog(null, "Invalid input. Please try again.");
        else if (choice == 1)
            JOptionPane.showMessageDialog(null,
                    "Good Day, you have reached Junaid the Technical Wizard im busy troubleshooting a UFO please leave a message. ");
        else if (choice == 2)
            JOptionPane.showMessageDialog(null,
                    "If you are being hacked my name is not Ayaan please block this number. DONT CALL ME!!!!!");
        else if (choice == 3)
            JOptionPane.showMessageDialog(null, "I'm on lunch break. I respond better to bribes.");
        else if (choice == 4)
            JOptionPane.showMessageDialog(null, "We are busy moving our accounts to a Swiss Bank to commit tax fraud");
        else
            JOptionPane.showMessageDialog(null,
                    "Such a drag, leave a message. I will try to get back as slow as possible. "); 

    } // closing main method
} // closing class header
