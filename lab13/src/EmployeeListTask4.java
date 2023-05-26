import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeListTask4 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();

        // Read the file and save employees to the collection
        try (BufferedReader reader = new BufferedReader(new FileReader("employees.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                employees.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        //  Print the size of the collection
        System.out.println("Size of the collection: " + employees.size());

        // Sort the collection in descending order (from Z to A)
        Collections.sort(employees, Collections.reverseOrder());

        System.out.println("\nContents of the collection in descending order:");
        for (String employee : employees) {
            System.out.println(employee);
        }
    }
}