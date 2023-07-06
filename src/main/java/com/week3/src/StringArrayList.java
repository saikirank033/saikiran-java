import java.util.ArrayList;


    public class StringArrayList {
        public static void main(String[] args) {
            ArrayList<String> stringList = new ArrayList<>();
            stringList.add("Hummer");
            stringList.add("Winner");
            stringList.add("Jaguar");
            stringList.add("Pagani");

            // Convert ArrayList to an Array
            String[] stringArray = stringList.toArray(new String[0]);

            // Print the array elements
            for (String element : stringArray) {
                System.out.println(element);
            }
        }
    }


