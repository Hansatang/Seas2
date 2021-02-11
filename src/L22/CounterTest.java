package L22;

public class CounterTest
{
  public static void main(String[] args)
  {
    Counter c = new Counter();
    Thread t = new Thread(new CounterIncrement(c));
    Thread t1 = new Thread(new CounterIncrement(c));

    t.start();
    t1.start();
  }
}
