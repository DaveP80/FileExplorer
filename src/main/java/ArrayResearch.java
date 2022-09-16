import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayResearch {

    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> combined = new ArrayList<>();
        ArrayList<Integer> first5num = new ArrayList<>();
        ArrayList<Integer> second5num = new ArrayList<>();

        //make arrays that contain random integers bound 10
        for (int i = 0; i < 5; i++) {
            first5num.add(i, rand.nextInt(10));
            combined.add(i, first5num.get(i));
        }
        for (int j = 0; j < 5; j++) {
            second5num.add(j, rand.nextInt(10));
            combined.add(j, second5num.get(j));
        }
        //print out combined array that contains elements from first5num and second5num
        System.out.println(combined);

        //print out MAP that holds duplicate values
        Map<Integer, Long> frequencies = combined.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        frequencies.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey()));
                }
            }

