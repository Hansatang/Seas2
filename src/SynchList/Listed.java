package SynchList;

import L2.Counter;

public class Listed implements Runnable
{
  private ListContainer counter;
  private String name;

  public Listed(String name,ListContainer counter)
  {
    this.name = name;
    this.counter = counter;
  }

  public synchronized void run()
  {
    for (int i = 0; i < 100000; i++)
    {

      counter.add(i);
    }
    System.out.println(name+" finished: Counter.value = " + counter.getLength());
  }
}