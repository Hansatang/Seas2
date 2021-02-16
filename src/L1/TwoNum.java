package L1;

public class TwoNum implements Runnable
{
  private int n, t;
  private Thread thread;

  public TwoNum(int n, int t,Thread thread)
  {
    this.thread=thread;
    this.n = n;
    this.t = t;
  }

  @Override public void run()
  {

    if (thread!=null)
    {
      try
      {
        thread.join();
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }
    for (int i = n; i < t; i++)
    {
      System.out.println(i);
    }
  }
}
