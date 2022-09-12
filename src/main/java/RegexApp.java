import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp { //returns result as array, with matcher as elements in the array
    public static void main(String[] args) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\david\\Desktop\\ResultFile")); //use path to your file created from pwsl script
        final List<String> names = new ArrayList<>();
        for (String line : lines) {
            Pattern pattern = Pattern.compile("(.*)sudo(.*)");
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                String name = matcher.group(0);
                name = name.substring(0);
                names.add(name);
            }
        }
        System.out.println("Paths found: " + names.toArray().length);
        for (int i = 0; i < names.toArray().length; i++) {
            System.out.println(names.toArray()[i]);
        }
//        System.out.println(Arrays.toString(names.toArray()));
    }

}
