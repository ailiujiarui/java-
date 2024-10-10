package xiancheng;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class tongxin {
    public static void main(String[] args) {
        printer pr=new printer();
        new Thread(new Runnable() {
            @Override
            public void run() {

                    while (true){
                        pr.print1();
                    }

            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {

                    while (true){
                        pr.print2();
                    }


            }
        }).start(); new Thread(new Runnable() {
            @Override
            public void run() {
                    while (true){
                        pr.print3();
                    }


            }
        }).start();
    }


}

class printer{
    ReentrantLock lock=new ReentrantLock();
        Condition c1 = lock.newCondition();
        Condition c2 = lock.newCondition();
        Condition c3 = lock.newCondition();

    int flag=1;
    void print1() {
        lock.lock();
        //使用标记来确认运行顺序
          if(flag!=1){
              try {
                  c1.await();
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
        System.out.print("鸡");
        System.out.print("你");
        System.out.print("太");
        System.out.print("美");
        System.out.println();
        // 唤醒另一个线程

        flag=2;
       c2.signal();
       lock.unlock();

    }
    void print2() {
        lock.lock();
        if(flag!=2){
            try {
                c2.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.print("你");
        System.out.print("实");
        System.out.print("在");
        System.out.print("是");
        System.out.print("太");
        System.out.print("美~");
        System.out.println();

        flag=3;
        c3.signal();
        lock.unlock();
    }
    void print3() {
        lock.lock();
        if(flag!=3){
            try {
                c3.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.print("O~");
        System.out.print("b");
        System.out.print("a");
        System.out.print("b");
        System.out.print("y");
        System.out.print("~");
        System.out.println();

        flag=1;
        c1.signal();
        lock.unlock();
    }
}
/*
class printer{
    int flag=1;
    void print1() {
        //使用标记来确认运行顺序
          if(flag!=1){
              try {
                  printer.class.wait();
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
        System.out.print("鸡");
        System.out.print("你");
        System.out.print("太");
        System.out.print("美");
        System.out.println();
        // 唤醒另一个线程

        flag=2;
        printer.class.notify();

    }
    void print2() {
        if(flag!=2){
            try {
                printer.class.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.print("你");
        System.out.print("实");
        System.out.print("在");
        System.out.print("是");
        System.out.print("太");
        System.out.print("美~");
        System.out.println();

        flag=3;
        printer.class.notify();
    }
    void print3() {
        if(flag!=3){
            try {
                printer.class.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.print("O~");
        System.out.print("b");
        System.out.print("a");
        System.out.print("b");
        System.out.print("y");
        System.out.print("~");
        System.out.println();

        flag=1;
        printer.class.notify();
    }
}
*/
