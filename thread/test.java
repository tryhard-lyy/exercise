package javabingfa;

import com.sun.xml.internal.stream.util.ThreadLocalBufferAllocator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class reentrantLock {
    private static Lock fairLock = new ReentrantLock2(true);
    private static Lock unfairLock = new ReentrantLock2(false);

    public void unfair(){
        testLock(unfairLock);
    }

    public void fair(){
        testLock(fairLock);
    }

    public void testLock(Lock lock){
        Job job1 = new Job(lock);
        Job job2 = new Job(lock);
        Job job3 = new Job(lock);
        Job job4 = new Job(lock);
        Job job5 = new Job(lock);
    }

    public static class Job extends Thread{
        private Lock lock;
        public Job(Lock lock){
            this.lock = lock;
        }
        public void run(){
            System.out.println("Lock by " + Thread.currentThread());
            System.out.println("Lock by " + Thread.currentThread());
        }
    }



    private static class ReentrantLock2 extends ReentrantLock{
        public ReentrantLock2(boolean fair){
            super(fair);
        }
        public Collection<Thread> getQueuedThreads(){
            List<Thread> arrayList = new ArrayList<Thread>(super.getQueuedThreads());
            Collections.reverse(arrayList);
            return arrayList;
        }
    }
}
