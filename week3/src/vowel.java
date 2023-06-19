
    import java.util.Arrays;

    public class vowel {

        public static void main(String[] args) {
            String[] strings = {"audi", "bugatti", "chevorlet", "dodge"};

            Arrays.stream(strings)
                    .filter(str -> containsVowels(str))
                    .forEach(str -> System.out.println(str + " - " + countVowels(str)));
        }

        public static boolean containsVowels(String str) {
            return str.toLowerCase().matches(".*[aeiou].*");
        }

        public static int countVowels(String str) {
            return (int) str.toLowerCase().chars()
                    .filter(ch -> "aeiou".indexOf(ch) != -1)
                    .count();
        }
    }


