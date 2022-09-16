import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Euclid {

    public static Random rand = new Random();

    public static void main(String[] args) {

        System.out.println(gcd(82, 70));
        System.out.println(uniform(.2222, .532));

        double[] arrayShuffle = {3.243, 422.4232, 4431.4341, 645.3434};

        shuffle(arrayShuffle);
        shuffle2(arrayShuffle);

        String[] a = new String[5];
        Arrays.fill(a, "kitty");
        System.out.println(Arrays.toString(a));

        String[] a1 = new String[5];
        for (int i = 0; i < a1.length; i++)
            a1[i] = "pony";
        System.out.println(Arrays.toString(a1));

        int[] intArray = {4, 3, 499, 3, 94};
        int max = intArray[0];
        for (int j : intArray)
            if (j > max) max = j;
        System.out.println(max);

    }

    public static int uniform(int N) {
        return (int) (Math.random() * rand.nextInt(N));
    }


    public static void shuffle(double[] a) {
        LinkedList<Double> newArray = new LinkedList<>();
        for (int i = 0; i < a.length; i++) { // Exchange a[i] with random element in a[i..N-1]

            int r = i + uniform(a.length);
            double temp = a[i];
            a[i] = a[r];
            a[r] = temp;
            newArray.add(temp);
            while (newArray.size() == a.length) {
                System.out.println(newArray);
                break;
            }

        }
    }
        public static void shuffle2(double[] a) {

		for (int i = 0; i < a.length; i++) {
        int randomIndexToSwap = rand.nextInt(a.length);
        double temp = a[randomIndexToSwap];
        a[randomIndexToSwap] = a[i];
        a[i] = temp;
    }
		System.out.println(Arrays.toString(a));
}

        public static double uniform ( double a, double b)
        {
            return a + Math.random() * (b - a);
        }
        public static int gcd ( int p, int q)
        {
            if (q == 0) return p;
            int r = p % q;
            return gcd(q, r);
        }
    }
