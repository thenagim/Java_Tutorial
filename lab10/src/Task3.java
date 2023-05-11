import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) {

        int bajt;

        try (FileInputStream fis = new FileInputStream("test123.txt");
             FileOutputStream fos = new FileOutputStream("test123_copy.txt")) {

            do {
                bajt = fis.read(); //reading bytes from file
                    if ((char)bajt ==' ') bajt = '-'; //replacing spaces
                    if (bajt != -1)
                        fos.write(bajt);
            } while (bajt != -1);


        } catch (IOException e) {
            System.out.println("Error reading or writing file");
        }
    }
}