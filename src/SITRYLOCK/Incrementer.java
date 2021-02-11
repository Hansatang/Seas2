package SITRYLOCK;
public class Incrementer implements Runnable
{
  private Counter counter;

  public Incrementer(Counter counter)
  {
    this.counter = counter;
  }

   public void run()
  {
    for (int i = 0; i < 1000000; i++)
    {
      counter.inc();
    }
    System.out.println(counter.get());
  }
}
