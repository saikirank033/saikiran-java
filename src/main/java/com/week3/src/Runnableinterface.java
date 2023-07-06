public class Runnableinterface implements Runnable {


        @Override
        public void run() {
            int i=0;
            for(i=0;i<11;i++){
                System.out.println(i + "");
            }
        }

        public static void main(String[] args) {
            Runnableinterface ex = new  Runnableinterface();
            Thread t1= new Thread(ex);
            t1.start();


        }
    }

