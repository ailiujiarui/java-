package jihe;

import java.util.LinkedList;

public class linklist {
    public static  void main(String []args){
        LinkedList<String> lk=new LinkedList<>();
        lk.addFirst("kun1");
        lk.add("jump");
        lk.add("jump");
        lk.add("jump");
        lk.add("jump");
        lk.addLast("mei1");
        System.out.println(lk.getFirst());
        System.out.println(lk.getLast());
        System.out.println(lk);
        lk.removeFirst();
        lk.removeLast();
        System.out.println(lk.get(1));
        System.out.println(lk);
    }
}
