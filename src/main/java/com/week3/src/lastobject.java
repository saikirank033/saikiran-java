
    import java.util.ArrayList;

    public class lastobject {
        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Audi");
            list.add("BMW");
            list.add("Opel");

            System.out.println("" + list);

            // Remove the last object
            if (!list.isEmpty()) {
                list.remove(list.size() - 1);
            }

            System.out.println("removal: " + list);
        }
    }


