public class Exception {
    public static int convertToInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred: " + e.getMessage());
            throw e;
        }
    }

    public static void main(String[] args) {
        String[] inputs = {"23", "45.6", "54f", "test"};

        for (String input : inputs) {
            try {
                int result = convertToInt(input);
                System.out.println("Input: " + input + " | Output: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Input: " + input + " | Exception: " + e.getMessage());
            }
        }
    }
}
