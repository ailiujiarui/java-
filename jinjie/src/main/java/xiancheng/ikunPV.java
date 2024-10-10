package xiancheng;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ikunPV {
    //生产者消费者模型
    public static void main(String[] args) {
        ikun pv = new ikun();
    new Thread(() -> {
        while (true) {
            pv.make();
        }

    }).start(); new Thread(() -> {
        while (true) {
            pv.play();
        }
    }).start();
    }
}
class ikun{
    ReentrantLock lock = new ReentrantLock();

        Condition makeL = lock.newCondition();
        Condition playL = lock.newCondition();


    public void make(){
        lock.lock();
        //判断是否生产篮球
        if(Basketball.now){
            try {
                makeL.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else {
            System.out.println("为坤坤生产篮球中");
            Basketball.now = true;
           playL.signal();
        }
      lock.unlock();
    }
    public void play(){
        //判断是否能玩篮球
        lock.lock();
        if(Basketball.now){
            System.out.println("坤坤玩篮球中");
            Basketball.now = false;
            makeL.signal();
        }
        else {
            try {
                playL.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Basketball{
    public static Boolean now=false;
}