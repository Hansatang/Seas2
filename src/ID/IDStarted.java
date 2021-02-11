package ID;

import java.util.ArrayList;
import java.util.List;

public class IDStarted
{
  public static void main(String[] args)
  {
    Counter c = new Counter(0, 50);
    Thread t0 = new Thread(new CounterInc("IncRobot", c, 200));
    Thread t1 = new Thread(new CounterInc("IncKaczka", c, 200));
    Thread t2 = new Thread(new CounterDec("DecCegla", c, 200));
    Thread t3 = new Thread(new CounterDec("DecMike", c, 200));


    List<Thread> threadList = new ArrayList<>();
    threadList.add(t0);
    threadList.add(t1);
    threadList.add(t2);
    threadList.add(t3);

      t0.start();
      t1.start();
      t2.start();
      t3.start();

    for(Thread t : threadList) {
      try
      {
        t.join();
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }
    System.out.print("All the threads are completed by now "+c.value());


  }
}
