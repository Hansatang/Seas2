package SITRYLOCK;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter
{
  private int count;
  private Lock lock = new ReentrantLock();

  //You should see that once again, we don’t reach 2.000.000,
  // because not all the time can the lock be acquired.
  // You should also see a bunch of print outs
  public void inc()
  {
    if (lock.tryLock())
    {
      count++;
      lock.unlock();
      //Try to fix it, so if the lock cannot be obtained,
      // you wait 1 ms and try again.
    }
    else
    {
      System.out.println("Lock was used");
      try
      {
        Thread.sleep(1);
      }
      catch (InterruptedException e)
      {
      }
      inc();
    }
  }

  public synchronized int get()
  {
    return count;
  }
}
