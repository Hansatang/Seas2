package SynchList;

import L2.Counter;
import L2.CounterIncrement;

public class LCStarted
{
  public static void main(String[] args)
  {
    ListContainer c = new ListContainer();
    Thread t = new Thread(new Listed("robot",c));
    Thread t1 = new Thread(new Listed("kaczka",c));

    t.start();
    t1.start();
  }
}
