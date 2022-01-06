package data.atom;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomCount {
   private AtomicInteger count = new AtomicInteger(0);

    public int getCount() {
        return count.get();
    }

    public void add(){
        count.incrementAndGet();
        System.out.println(count.get());
    }
}
