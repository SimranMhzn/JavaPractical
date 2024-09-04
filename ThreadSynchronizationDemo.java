public class ThreadSynchronizationDemo {
    public static void main(String[] args) {
        MySharedResources sharedResources = new MySharedResources();
        Thread t = new Thread(() -> sharedResources.sayHello(), "Thread-1");
        Thread h= new Thread(() -> sharedResources.sayHello(), "Thread-2");
        Thread r = new Thread(() -> sharedResources.sayHello(), "Thread-3");
        t.start();
        h.start();
        r.start();
        try {
            t.join();
            h.join();
            r.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class MySharedResources {
    // Synchronized method to ensure only one thread can execute it at a time
    public synchronized void sayHello() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " is starting.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadName + " is done.");
    }
}
