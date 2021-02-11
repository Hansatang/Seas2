package CS;

public class Mailbox implements Runnable
{
  private int count;
  private long RUNTIME = 100000;

  public Mailbox(int count )
  {
    this.count = count;
  }

  @Override public void run()
  {
    for (int i = 0; i <count ; i++)
    {
      try
      {
        Thread.sleep(RUNTIME/count);
        System.out.println("New mail");
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }
  }
}
