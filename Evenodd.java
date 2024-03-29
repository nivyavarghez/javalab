public class Evenodd {

    public static void main(String[] args) {
        Runnable r = new Runnable1();
        Thread t = new Thread(r);
        Runnable r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        t.start();
        t2.start();

	 try {
            t.join(); // Wait for the first thread to finish
            t2.join(); // Wait for the second thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Runnable2 implements Runnable{
    public void run(){
        for(int i=0;i<=100;i+=2) {
            System.out.println(i);
        }
    }
}

class Runnable1 implements Runnable{
    public void run(){
        for(int i=1;i<=100;i+=2) {
           System.out.println(i);
        }
    }
}