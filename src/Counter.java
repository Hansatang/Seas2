public class Counter
{
  private long value;

  public Counter()
  {
    this.value = 0;
  }

  public synchronized void inc()
  {
    value++;
  }

  public synchronized long value()
  {
    return value;
  }
}