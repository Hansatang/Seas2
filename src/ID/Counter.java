package ID;

public class Counter
{
  private long value;
  private long max;
  private long min;

  public Counter(long min, long max)
  {
    this.value = 0;
    this.min = min;
    this.max = max;
  }

  public synchronized void inc()
  {
    while (value >= max)
    {
      try
      {
        wait();
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }
    value++;
    System.out.println(value + ": " + Thread.currentThread().getName());
    notifyAll();
  }

  public synchronized void dec()
  {
    while (value <= min)
    {
      try
      {
        wait();
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }
    value--;
    System.out.println(value + ": " + Thread.currentThread().getName());
    notifyAll();
  }

  public synchronized long value()
  {
    return value;
  }
}