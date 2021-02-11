public class Bear implements Runnable
{
  private String name;

  public Bear(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  @Override public void run()
  {
    {
      while (true)
      {
        try
        {
          Thread.sleep(1000);
          System.out.println(name + " Lazy wake");
        }
        catch (InterruptedException e)
        {
          System.out.println(name + " Angry wake");
        }
      }
    }
  }
}
