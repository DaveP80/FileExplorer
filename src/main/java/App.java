import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App { //returns full file paths that contain a substring
    public static void main(String[] args) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\yourName\\examplefile.txt")); //use path to your file
        for (String line : lines) {
            Pattern pattern = Pattern.compile(".*example*");
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {

                System.out.println(line);
            }
        }
    }
}