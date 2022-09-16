import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class FindWord {
    public static void main(String[] args) throws IOException {
        ArrayList<String> countlines = new ArrayList<>();
        final String regex = "[a-zA-Z]+";
        final String regex2 = "/*and/*"; //bring back specific strings from array
        final String string = String.valueOf(Files.readAllLines(Paths.get("warnpeace2.txt")));

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {

            countlines.add(matcher.group(0));
        }
        System.out.println(countlines.size());
        System.out.println(countlines);
        //find number of occurances of string in the array countlines
        Stream<String> newWords = countlines.stream().filter(s -> s.matches(regex2));
        long occurances = countlines.stream().filter(s -> s.matches(regex2)).count();
        System.out.println("Expressions found: " + occurances);
        newWords.forEach((n) -> System.out.print(n + " "));
    }
}
