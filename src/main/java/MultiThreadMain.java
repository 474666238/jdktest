import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class MultiThreadMain {

    static ReentrantLock lock = new ReentrantLock(true);

    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(new Runner());
        executor.shutdownNow();
       executor.execute(new Runner());
    }
}


class Runner implements Runnable {

    @Override
    public void run() {
        MultiThreadMain.lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "，hold the lock！！！");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } finally {
            MultiThreadMain.lock.unlock();
        }
    }
}
