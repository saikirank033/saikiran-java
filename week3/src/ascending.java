
    import java.util.Arrays;
import java.util.Comparator;

    public class ascending  {

        public static void main(String[] args) {
            String[] strings = {"audi", "benz", "chevy", "dodge"};

            Arrays.sort(strings, Comparator.comparingInt(String::length)
                    .thenComparing((str1, str2) -> Character.compare(str2.charAt(str2.length() - 1), str1.charAt(str1.length() - 1))));

            System.out.println(Arrays.toString(strings));
        }
    }


