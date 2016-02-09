import java.io.*;

public class Sales_Tax_Java {
    public static void main(String[] args) {

        // The name of the file to open.
        String fileName = "input_file.txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Always close files.
            bufferedReader.close();
        }
        catch(Exception ex)
        {
            System.out.println("a bad thing happened");
        }
    }
}
