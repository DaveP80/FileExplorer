import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StreamSearch {
    public static Random rand = new Random();
    private static int getRandomIndex(int arraySize) {
        return rand.nextInt(arraySize);
    }

    public static void main(String[] args) throws IOException {

        ArrayList<String> countlines = new ArrayList<>();
        ArrayList<String> commonwords = new ArrayList<>();
        //Put all words from both files into arrays
        final String regex = "[a-zA-Z]+";
        final String string = String.valueOf(Files.readAllLines(Paths.get("warnpeace.txt")));
        final String string2 = String.valueOf(Files.readAllLines(Paths.get("commonwords.txt")));

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);
        final Pattern pattern2 = Pattern.compile(regex);
        final Matcher matcher2 = pattern2.matcher(string2);

        while (matcher.find()) {
            countlines.add(matcher.group(0));
        }

        while (matcher2.find()) {
            commonwords.add(matcher2.group(0));
        }
        System.out.println("size of common words: " + commonwords.size());
        System.out.println(countlines.size());
        System.out.println(countlines);
        System.out.println();

        System.out.println(">>>NO DUPLICATE WORDS<<<");

        Set<String> set = new HashSet<>(countlines);  //take an existing array list, and make
        //a new Set Array with no duplicates
        System.out.println(set.size());
        System.out.println(set);

        ArrayList<String> editlist = new ArrayList<>();
        ArrayList<String> editlist2 = new ArrayList<>();

        editlist.addAll(set);

        for (String i : editlist) {
            if (editlist2.size() == countlines.size())
                break;
            editlist2.add(i);
            editlist2.add(commonwords.get(rand.nextInt(45)));

        }

        int i;
        for (i = 0; i <= 1000000; i++) {
            if (editlist2.size() == countlines.size())
                break;
            editlist2.add(getRandomIndex(editlist2.size()), commonwords.get((int) ((Math.random() * (commonwords.size() - 50)) + 50)));
        }
        System.out.println("\n" + editlist2.size());
//        Collections.shuffle(editlist2);
        System.out.println(editlist2);
    }
}





