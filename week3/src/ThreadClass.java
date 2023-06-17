public class ThreadClass extends Thread {
    public static void main(String[]args){
        ThreadClass thread = new ThreadClass();
        thread.start();
    }
    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.println(i + "");
        }
    }
}
