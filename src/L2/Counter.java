package L2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter
{
  private int value;
  private Lock lock = new ReentrantLock();

  public Counter()
  {
    this.value = 0;
  }

  public void inc()
  {
    if (lock.tryLock())
    {
      value++;
      lock.unlock();
    }
    else
    {
      System.out.println("          Lock in use");
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

  public synchronized int value()
  {
    return value;
  }
}