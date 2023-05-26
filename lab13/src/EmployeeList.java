import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeList {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();

        // Task (a) - Read the file and save employees to the collection 
        try (BufferedReader reader = new BufferedReader(new FileReader("employees.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                employees.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        // Task (c) - Print the size of the collection 
        System.out.println("Size of the collection: " + employees.size());

        // Task (d) - Print the contents of the collection 
        System.out.println("\nContents of the collection using a standard loop:");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        System.out.println("\nContents of the collection using the for-each loop:");
        for (String employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\nContents of the collection using the Iterator interface:");
        Iterator<String> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
} 