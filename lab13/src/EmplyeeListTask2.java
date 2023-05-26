import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EmplyeeListTask2 {
    public static void main(String[] args) {
        Set<String> employees = new HashSet<>();

        // Read the file and save employees to the collection
        try (BufferedReader reader = new BufferedReader(new FileReader("employees.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                employees.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        // Print the size of the collection
        System.out.println("Size of the collection: " + employees.size());

        //  Print the contents of the collection
        System.out.println("\nContents of the collection using a standard loop:");
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
//I put 5 data the output showing 3 data