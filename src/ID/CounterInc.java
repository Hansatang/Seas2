package ID;

public class CounterInc implements Runnable
{
  private int update;
  private Counter counter;
  private String name;

  public CounterInc(String name, Counter counter, int update)
  {
    this.name = name;
    this.counter = counter;
    this.update = update;
  }

  @Override public void run()
  {
    for (int i = 0; i < update; i++)
    {
      counter.inc();
    }
    System.out.println(update);
  }
}
