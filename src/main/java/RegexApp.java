import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp { //returns result as array, sorted by the size of elements
    public static void main(String[] args) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\david\\desktop\\warnpeace.txt")); //use path to your file created from pwsl script
        List<String> names = new ArrayList<>();
        //find all occurances of the substring
        for (String line : lines) {
            Pattern pattern = Pattern.compile("(.*)lady(.*)");
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                String name = matcher.group(0);
                name = name.substring(0);
                names.add(name);
                names.sort(Comparator.comparingInt(String::length));
            }
        }
        System.out.println("Paths found: " + names.size());

        for (String i : names) {
            System.out.println(i);
        }
    }
}


