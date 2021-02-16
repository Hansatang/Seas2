package L1;

import java.util.ArrayList;
import java.util.Random;

public class PokeMan implements Runnable
{

  private ArrayList<Thread> list;

  public PokeMan(ArrayList<Thread> list)
  {
    this.list = list;
  }

  @Override public void run()
  {
    while (true)
    {
      try
      {
        Thread.sleep(2000);
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
      Random r = new Random();

      int l = r.nextInt(list.size());
      list.get(l).interrupt();
      for (int i = 0; i < list.size(); i++)
      {
        if (i != l)
        {
          if (!list.get(i).isInterrupted())
          {
            list.get(i).interrupt();
          }
        }
      }
    }
  }
}
