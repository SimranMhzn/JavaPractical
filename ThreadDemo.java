
class OddThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Error in "+Thread.currentThread().getName());
            }
            if(i%2==1)
                System.out.println(i);
        }
    }
}

class EvenThread extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Error in "+Thread.currentThread().getName());
            }
            if(i%2==0)
                System.out.println(i);
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        OddThread odd= new OddThread();
        EvenThread even= new EvenThread();
        Thread thread=new Thread(odd);
        thread.start();
        Thread thread2=new Thread(even);
        thread2.start();
    }
}