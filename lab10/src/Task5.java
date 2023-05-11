import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Task5 {
    public static void main(String[] args) {
        // Get input from user
        String userInput = getUserInput();
        String bankNumber = userInput.substring(0, 3);

        try {
            // Load contents of text file from URL
            URL url = new URL("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            System.out.println("Reads data from a file...");
            boolean bankFound = false;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split(";");

                //  array has at least two elements before accessing them
                if (words.length >= 2) {
                    String bankNumberFromFile = words[0].trim();
                    String bankName = words[1].trim();

                    // Compare bank number with user input
                    if (bankNumberFromFile.equals(bankNumber)) {
                        System.out.println("Your Bank number is: " + bankNumberFromFile);
                        System.out.println("Your bank name is: " + bankName);
                        bankFound = true;
                        break;
                    }
                }
            }

            reader.close();

            if (!bankFound) {
                System.out.println("Bank not found for the provided bank account number.");
            }
        } catch (IOException e) {
            System.out.println("Error: Could not read data from the provided URL.");
        }
    }

    private static String getUserInput() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the first three digits of your bank account: ");
        try {
            return reader.readLine();
        } catch (IOException e) {
            System.out.println("Error: Could not read user input.");
            return null;
        }
    }
}