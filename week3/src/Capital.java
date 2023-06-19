
    import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

    public class Capital  {

        public static void main(String[] args) {
            String[] strings = {"maruthi", "porshe", "bugatti", "dodge"};

            Stream<String> capitalizedStream = Arrays.stream(strings)
                    .map(str -> Character.toUpperCase(str.charAt(0)) + str.substring(1))
                    .sorted(Comparator.naturalOrder());

            capitalizedStream.forEach(System.out::println);
        }
    }


