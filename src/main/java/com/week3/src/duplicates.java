
    import java.util.LinkedHashSet;

    public class  duplicates{
        public static void main(String[] args) {
            String input = "Hello Java!!";
            String result = removeDuplicates(input);
            System.out.println(result);
        }

        public static String removeDuplicates(String str) {

            LinkedHashSet<Character> charSet = new LinkedHashSet<>();

            for (char c : str.toCharArray()) {

                charSet.add(c);
            }

            StringBuilder sb = new StringBuilder();
            for (char c : charSet) {
                sb.append(c);
            }

            return sb.toString();
        }
    }


