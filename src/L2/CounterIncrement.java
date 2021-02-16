package L2;

public class CounterIncrement implements Runnable
{
  private Counter counter;
  private String name;

  public CounterIncrement(String name,Counter counter)
  {
    this.name = name;
    this.counter = counter;
  }

  public void run()
  {
    for (int i = 0; i < 1000000; i++)
    {
      counter.inc();

    }
    System.out.println(name+" finished: L1.Counter.value = " + counter.value());
  }
}

