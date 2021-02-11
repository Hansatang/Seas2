package L22;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter
{
  private int value1;
  private int value2;
  private Lock lock1 = new ReentrantLock();
  private Lock lock2 = new ReentrantLock();

  public Counter()
  {
    this.value1 = 0;
    this.value2 = 0;
  }

  public void inc1()
  {
    synchronized (lock1)
    {
      value1++;
    }
  }

  public void inc2()
  {
    synchronized (lock2)
    {
      value2++;
    }
  }

  public synchronized int value1()
  {
    return value1;
  }
  public synchronized int value2()
  {
    return value2;
  }
}