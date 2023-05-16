import java.io.BufferedReader;
import java.io.*;

public class DealershipFileManager {
    private static final String file = "Dealership.csv";
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
