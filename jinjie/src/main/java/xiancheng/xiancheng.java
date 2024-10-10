package xiancheng;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class xiancheng {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //直接继承Thread类来实现多线程
      /*  MyThread myThread = new MyThread();
        myThread.setName("ikun1");
        myThread.setPriority(10);

        myThread.start();

        MyThread myThread2 = new MyThread();
        myThread2.setPriority(1);
        myThread2.setName("ikun2");
        myThread2.start();
        System.out.println(myThread.getPriority());*/
        //实现Runnable接口来实现多线程

        MyThread1 myThread = new MyThread1();
        Thread th =new Thread(myThread);
        Thread th1 =new Thread(myThread);
        th.start();
        th1.start();

       /* //实现callable接口实现多线程
       MyThread2 my =new MyThread2();
       FutureTask<String> future = new FutureTask<>(my);
       new Thread(future).start();
        String s = future.get();
        System.out.println(s);*/

        /*for (int i = 0;i<1000; i++) {
            System.out.println("main");
        }*/
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(super.getName()+"当前是第"+i+"次");
        }

    }
}
class MyThread1 implements Runnable {
    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 1000; i++) {
                System.out.println(Thread.currentThread().getName()+ "what can i say");
            }
        }

    }
}
class MyThread2 implements Callable<String> {

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 10000; i++) {System.out.println("ikun");}

        return "ikun";
    }
}