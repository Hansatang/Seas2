package ID;

public class CounterDec implements Runnable
{
  private int update,number;
  private Counter counter;
  private String name;

  public CounterDec(String name, Counter counter, int update)
  {
    this.number=0;
    this.name = name;
    this.counter = counter;
    this.update = update;
  }

  @Override public void run()
  {
    while (number<update)
    {
      counter.dec();
      number++;
    }
    System.out.println(update);
  }
}
