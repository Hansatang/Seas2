public class Bear implements Runnable
{

  @Override public void run()
  {
    {
      try
      {
        Thread.sleep(5000);
      }
      catch (InterruptedException e)
      {
        Thread.currentThread().interrupt();
      }

      if (Thread.interrupted())
      {
        System.out.println("Feck");
      }
      else
      {
        System.out.println("yaw");
      }
    }
  }
}
