package oleg.threads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockObj {

  public static void main(String[] args) throws InterruptedException {
    Lock lock = new ReentrantLock();
    lock.tryLock();
    lock.lockInterruptibly();
    lock.lock();

    Condition condition = lock.newCondition();
    condition.await();
    condition.signal();
    condition.signalAll();

  }
}
