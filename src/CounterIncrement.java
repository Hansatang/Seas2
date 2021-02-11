public class CounterIncrement implements Runnable
{
  private Counter counter;

  public CounterIncrement(Counter counter)
  {
    this.counter = counter;
  }

  public void run()
  {
    for (int i = 0; i < 100000; i++)
    {
      counter.inc();
      System.out.println(" finished: Counter.value = " + counter.value());
    }
  }
}

