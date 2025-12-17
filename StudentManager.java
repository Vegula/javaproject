import java.util.HashMap;
import java.util.Map;

public class StudentManager
 {
    // HashMap provides O(1) average time complexity for lookups
    private Map<String, Student> studentMap = new HashMap<>();

    public void addStudent(String id, String name, double gpa) 
    {
        Student s = new Student(id, name, gpa);
        studentMap.put(id, s);
        System.out.println("Student added successfully!");
    }

    public void displayAll() 
    {
        if (studentMap.isEmpty()) 
            {
            System.out.println("No records found.");
            return;
            }
        for (Student s : studentMap.values()) 
            {
            System.out.println(s);
            }
    }

    public void findStudent(String id)
     {
        if (studentMap.containsKey(id))
             {
            System.out.println("Found: " + studentMap.get(id));
             } 
        else  
             {
                //id not found
            System.out.println("Student ID not found.");
             }
    }
}
