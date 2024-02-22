import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class HelloApplication {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the filename as a command-line argument.");
            return;
        }

        String filename = args[0];
        Set<String> uniqueWords = new TreeSet<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        uniqueWords.add(word.toLowerCase());
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            return;
        }

        // Display the non-duplicate words in descending order
        for (String word : ((TreeSet<String>) uniqueWords).descendingSet()) {
            System.out.println(word);
        }
    }
}
/*
commandline arhument
java com.example.demo1.HelloApplication raj.txt ram.txt roy.txt
o/p
raj
ram
roy
*/
