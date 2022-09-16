import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App { //returns full file paths that contain a substring
    public static void main(String[] args) throws IOException {
        List<String> countlines = new ArrayList<>();
        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\yourName\\desktop\\warnpeace.txt")); //use path to your file
        for (String line : lines) {
//            Pattern pattern = Pattern.compile("(.*)animal(.*)");
            //search for string
            Pattern pattern = Pattern.compile("(?i) king(.*)");
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
//                countlines.add(matcher.group());
                System.out.println(line);
            }
        }
        for (String sentence: countlines) {
        System.out.println(sentence); }
        System.out.println(">>>>number of lines with expression " + countlines.size());
    }
}