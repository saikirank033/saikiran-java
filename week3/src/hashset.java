 import java.util.HashSet;
import java.util.Iterator;

    public class hashset {
        public static void main(String[] args) {
            // Create a HashSet
            HashSet<String> stringSet = new HashSet<>();


            stringSet.add("Alfa Romeo");
            stringSet.add("Bentley");
            stringSet.add("Opel");
            stringSet.add("GM");
            stringSet.add("Mercedes");



            System.out.println("Iteration using Iterator:");
            Iterator<String> iterator = stringSet.iterator();
            while (iterator.hasNext()) {
                String element = iterator.next();
                System.out.println(element);
            }


            System.out.println("\nIteration using ForEach:");
            for (String element : stringSet) {
                System.out.println(element);
            }


            System.out.println("\nIteration using Streams ForEach:");
            stringSet.stream().forEach(System.out::println);
        }
    }

