package L1;

public class Turtle implements Runnable
{
  private int meta ;

  public Turtle()
  {
    this.meta = 0;
  }

  public int getMeta()
  {
    return meta;
  }

  @Override public void run()
  {
    for (int meta = 0; meta < 1001; meta++)
    {
      System.out.println("t"+meta);
      try
      {
        Thread.sleep(10);
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
      if (meta>=1000)
      {
        System.out.println("turtle");
      }
    }
  }
}
