import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class DataManagement4 {

    public static void readData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first and last name: ");
        String name = scanner.nextLine();
        scanner.close();
        writeDataToFile(name);
        readDataFromFile();
    }

    public static void writeDataToFile(String name) {
        try {
            Path path = Path.of("dataOfUser.txt");
            Files.writeString(path, name.replace(" ", "\n") + "\n");
            System.out.println("Data written to file");
        } catch (IOException e) {
            System.out.println("Ooops! Error when writing to file");
        }
    }

    public static void readDataFromFile() {
        try {
            Path path = Path.of("dataOfUser.txt");
            String data = Files.readString(path);
            System.out.println("Data read from file: " + data.replace("\n", " "));
        } catch (IOException e) {
            System.out.println("Ooops! Error when writing to file");
        }
    }
}