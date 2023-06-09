

    public class  Deadlock{

        String str1 = "java";
        String str2 = "SCRIPT";

        Thread trd1 = new Thread("My Thread 1"){
            public void run(){
                while(true){
                    synchronized(str1){
                        synchronized(str2){
                            System.out.println(str1 + str2);
                        }
                    }
                }
            }
        };

        Thread trd2 = new Thread("My Thread 2"){
            public void run(){
                while(true){
                    synchronized(str2){
                        synchronized(str1){
                            System.out.println(str2 + str1);
                        }
                    }
                }
            }
        };

        public static void main(String a[]){
            Deadlock mdl = new  Deadlock();
            mdl.trd1.start();
            mdl.trd2.start();
        }
    }

