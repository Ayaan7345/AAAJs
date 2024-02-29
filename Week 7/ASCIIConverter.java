import java.util.Scanner;

public class ASCIIConverter 
{
    public static void main(String[] args) {
        // Declare variables
        Scanner scanner;
        int uAsciiI;
        char characterC;
        
        // Create a Scanner object to read input from the user
        scanner = new Scanner(System.in);
        
        // Prompt the user to enter an ASCII code
        System.out.print("Enter an ASCII code (an integer between 0 and 127): ");
        asciiCode = scanner.nextInt();
        
        // Convert ASCII code to character
        character = (char) uAsciiI;
        
        // Display the result
        System.out.println("The character for ASCII code " + asciiCode + " is " + character);
        
        // Close the scanner
        scanner.close();
    }
}
