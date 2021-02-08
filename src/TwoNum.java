public class TwoNum implements Runnable
{
  private int n, t;

  public TwoNum(int n, int t)
  {
    this.n = n;
    this.t = t;
  }

  @Override public void run()
  {
    for (int i = n; i < t; i++)
    {
      System.out.println(i);
    }
  }
}
