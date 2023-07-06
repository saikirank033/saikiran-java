
    import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

    public class Multithreaded  {
        private static final int ARRAY_SIZE = 100;
        private static final int THREAD_COUNT = 5;
        private static final int PARTITION_SIZE = ARRAY_SIZE / THREAD_COUNT;

        private static int[] array = new int[ARRAY_SIZE];
        private static int[] partialSums = new int[THREAD_COUNT];

        public static void main(String[] args) {

            for (int i = 0; i < ARRAY_SIZE; i++) {
                array[i] = i + 1;
            }


            ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);


            for (int i = 0; i < THREAD_COUNT; i++) {
                final int startIndex = i * PARTITION_SIZE;
                final int endIndex = (i + 1) * PARTITION_SIZE;
                final int threadIndex = i;

                executor.submit(() -> {
                    int sum = 0;
                    for (int j = startIndex; j < endIndex; j++) {
                        sum += array[j];
                    }
                    partialSums[threadIndex] = sum;
                });
            }


            executor.shutdown();
            try {
                executor.awaitTermination(1, TimeUnit.MINUTES);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int finalSum = 0;
            for (int sum : partialSums) {
                finalSum += sum;
            }

            System.out.println("Final Sum: " + finalSum);
        }
    }


