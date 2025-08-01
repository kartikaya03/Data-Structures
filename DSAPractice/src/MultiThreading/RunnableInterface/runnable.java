package MultiThreading.RunnableInterface;

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

}
public class runnable {
    public static void main(String[] args) {
        Thread r = new Thread(new MyRunnable());
        r.start();
    }
}
