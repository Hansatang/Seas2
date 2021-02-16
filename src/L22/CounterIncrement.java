package L22;

public class CounterIncrement implements Runnable
{
  private Counter counter;

  public CounterIncrement(Counter counter)
  {
    this.counter = counter;
  }

  public void run()
  {
    for (int i = 0; i < 1000000; i++)
    {
      counter.inc1();
      System.out.println(" finished: L1.Counter.value1 = " + counter.value1());
      counter.inc2();
      System.out.println(" finished: L1.Counter.value2 = " + counter.value2());
    }
  }
}

