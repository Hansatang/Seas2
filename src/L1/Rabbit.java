package L1;

import java.util.Random;

public class Rabbit implements Runnable
{
  private Turtle turtle;
  private int meta;

  public Rabbit(Turtle turtle)
  {
    this.turtle = turtle;
    this.meta = 0;
  }

  @Override public void run()
  {
    for (int meta = 0; meta < 1000; )
    {
      System.out.println("      r" + meta);
      try
      {
        Random r = new Random();
        if (meta > turtle.getMeta())
        {
          int i = r.nextInt(500);
          Thread.sleep(i);
        }

        int i = r.nextInt(50);
        meta += i;
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }

    }
    System.out.println("rabbit");
  }
}
