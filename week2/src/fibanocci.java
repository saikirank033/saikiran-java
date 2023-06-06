public class fibanocci {

        public static void main(String[] args) {

            int n = 10, a = 0, b = 1;
            System.out.println("Fibonacci Series till " + n + " terms:");


            for (int i = 1; i <= n; ++i) {
                System.out.print(a+ ", ");

                // compute the next term
                int next = a +b;
                a = b;
               b = next;
            }
        }
    }

