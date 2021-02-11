package L2;

public class CounterTest
{
  public static void main(String[] args)
  {
    Counter c = new Counter();
    Thread t = new Thread(new CounterIncrement("robot",c));
    Thread t1 = new Thread(new CounterIncrement("kaczka",c));

    t.start();
    t1.start();
  }
}
