//CLI-based Student Management System demonstrating OOP and efficient data retrieval.
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Apex Student Manager ---");
        // Simple loop for the demo
        manager.addStudent("S101", "Arjun ", 9.0);
        manager.addStudent("S102", "Harry ", 9.5);
        
        System.out.println("\nCurrent Records:");
        manager.displayAll();
        
        System.out.print("\nEnter ID to search: ");
        String searchId = scanner.nextLine();
        manager.findStudent(searchId);
        
        scanner.close();
    }
}