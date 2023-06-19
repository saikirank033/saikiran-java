 import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock; // a single thread can acquire the lock multiple times without deadlocking

    public class  Multiplethreads {
        private int availableTickets;
        private Lock lock;

        public Multiplethreads(int availableTickets) {
            this.availableTickets = availableTickets;
            this.lock = new ReentrantLock();
        }

        public void bookTicket(int requestedTickets) {
            lock.lock();
            try {
                if (availableTickets >= requestedTickets) {
                    System.out.println(Thread.currentThread().getName() + " - Booking " + requestedTickets + " ticket(s).");
                    availableTickets -= requestedTickets;
                    System.out.println("Tickets booked successfully. Available tickets: " + availableTickets);
                } else {
                    System.out.println(Thread.currentThread().getName() + " - Insufficient tickets. Available tickets: " + availableTickets);
                }
            } finally {
                lock.unlock();
            }
        }
    }

     class MultiplethreadsSimulation {
        public static void main(String[] args) {
            Multiplethreads bookingSystem = new  Multiplethreads(10);


            Thread thread1 = new Thread(() -> bookingSystem.bookTicket(3));
            Thread thread2 = new Thread(() -> bookingSystem.bookTicket(4));
            Thread thread3 = new Thread(() -> bookingSystem.bookTicket(2));
            Thread thread4 = new Thread(() -> bookingSystem.bookTicket(5));


            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();
        }
    }


