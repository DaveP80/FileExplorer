import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App { //returns full file paths that contain a substring
    public static void main(String[] args) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\yourName\\desktop\\warnpeace.txt")); //use path to your file
        for (String line : lines) {
            Pattern pattern = Pattern.compile("(?i) example(.*)"); //find all, ignoring case, strings of king
//            ("/*example/*")
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
             //   prints out only the regex match
                System.out.println(matcher.group(0)+" ");
                System.out.print(matcher.group(1));
//                System.out.println(line);
//                System.out.println(line);

            }

        }
    }
}