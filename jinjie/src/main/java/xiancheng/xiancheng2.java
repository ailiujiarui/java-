package xiancheng;

import java.util.concurrent.locks.ReentrantLock;

public class xiancheng2 {
    public static void main(String[] args) {
        MyThreads myThread = new MyThreads();
        MyThreads myThread1 = new MyThreads();
        MyThreads myThread2 = new MyThreads();


        myThread.start();
        myThread1.start();
        myThread2.start();
    }
}

class MyThreads extends Thread {
    static private int ticket =1000;
  static ReentrantLock lock = new ReentrantLock();
  /*  @Override
    public void run() {
   while (true) {
       synchronized ("S") {
           if(ticket==0){
               break;
           }
           System.out.println(Thread.currentThread().getName()+"第"+ticket+"坤坤");
           ticket--;
       }

   }

    }*/
   /* @Override
    public void run() {
        while (true) {
           if (method()) {
               break;
           }
        }
    }

    private static   synchronized Boolean  method(){
        
        if(ticket==0){
            return true;
        }
        System.out.println(Thread.currentThread().getName()+"第"+ticket+"坤坤");
        ticket--;
        return false;
    }*/
    @Override
    public void run() {
        while (true){
            lock.lock();
            if (ticket == 0) {
                lock.unlock();
                break;
            }
            System.out.println("卖出第"+ticket+"票");
            ticket--;
            lock.unlock();
        }
    }
 }