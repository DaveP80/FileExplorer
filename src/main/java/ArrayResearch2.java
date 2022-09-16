import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayResearch2 {
    public static void main(String[] args) {

        ArrayList<Integer> duplicates = new ArrayList<>();
        ArrayList<Integer> finalArray = new ArrayList<>();
        ArrayList<Integer> first5num = new ArrayList<>();
        ArrayList<Integer> second5num = new ArrayList<>();
        first5num.add(4);
        first5num.add(7);
        first5num.add(0);
        first5num.add(10);
        first5num.add(4);

        second5num.add(4);
        second5num.add(6);
        second5num.add(5);
        second5num.add(0);
        second5num.add(3);
        for (int i = 0; i < 5; i++) {
            duplicates.add(i, first5num.get(i));
        }
        for (int j = 0; j < 5; j++) {
            duplicates.add(j, second5num.get(j));
        }
        Set<Integer> set = new HashSet<Integer>(duplicates);  //take an existing array list, and make
        //a new Set Array with no duplicates

        System.out.println(set);

        Map<Integer, Long> frequencies = duplicates.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //print out only duplicate values from original 2 lists
        frequencies.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey()));
        //print out an array that combines both arrays and has no duplicates
        frequencies.entrySet().stream()
                .filter(entry -> entry.getValue() ==1)
                .forEach(entry ->finalArray.add(entry.getKey()));
        System.out.println(finalArray);
    }
}
