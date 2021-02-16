package ID;

public class CounterInc implements Runnable
{
  private int update,number;
  private Counter counter;
  private String name;

  public CounterInc(String name, Counter counter, int update)
  {
    this.number =0;
    this.name = name;
    this.counter = counter;
    this.update = update;
  }

  @Override public void run()
  {
    while(number<update)
    {
      counter.inc();
      number++;

    }
    System.out.println(update);
  }
}
