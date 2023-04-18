
// Write a java program that implements a multi-thread application that has three threads. 
// First thread generates a random integer every 1 second and if the value is even, the second 
// thread computes the square of the number and prints. If the value is odd, the third thread 
// will print the value of the cube of the number.
import java.util.Random;

public class Multithreading_shit {
    public static void main(String[] args) {
        Random random = new Random();

        Thread thread1 = new Thread(() -> {
            while (true) {
                int value = random.nextInt(100);
                System.out.println("Thread 1 generated: " + value);
                synchronized (Monitor.monitor) {
                    Monitor.number = value;
                    Monitor.lastParity = value % 2;
                    Monitor.monitor.notifyAll();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                synchronized (Monitor.monitor) {
                    while (Monitor.number == null || Monitor.isComputing || Monitor.lastParity != 0) {
                        try {
                            Monitor.monitor.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    int value = Monitor.number;
                    Monitor.isComputing = true;
                    System.out.println("Thread 2 computed: " + (value * value));
                    Monitor.isComputing = false;
                    Monitor.number = null;
                    Monitor.monitor.notifyAll();
                }
            }
        });

        Thread thread3 = new Thread(() -> {
            while (true) {
                synchronized (Monitor.monitor) {
                    while (Monitor.number == null || Monitor.isComputing || Monitor.lastParity != 1) {
                        try {
                            Monitor.monitor.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    int value = Monitor.number;
                    Monitor.isComputing = true;
                    System.out.println("Thread 3 computed: " + (value * value * value));
                    Monitor.isComputing = false;
                    Monitor.number = null;
                    Monitor.monitor.notifyAll();
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Monitor {
    static final Object monitor = new Object();
    static Integer number = null;
    static boolean isComputing = false;
    static int lastParity = -1;
}
