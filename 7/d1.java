import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class d1 {
    public static void main(String[] args) {
        String filename = "123.txt";

        try {
            FileWriter fileWriter = new FileWriter(filename, true);
            Random random = new Random();

            // Generate and write 150 random integers to the file
            for (int i = 0; i < 150; i++) {
                int randomNumber = random.nextInt();
                fileWriter.write(randomNumber + " ");
            }

            fileWriter.close();
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
/* 123.txt is the data which is written sucessfully
 o/p ->
data written to file successfully
*/