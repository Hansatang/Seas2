public class TwoNumTest
{
  public static void main(String[] args)
  {
    Thread TN1 = new Thread(new TwoNum(0, 2500));
    Thread TN2 = new Thread(new TwoNum(2500, 5000));
    Thread TN3 = new Thread(new TwoNum(5000, 7500));
    Thread TN4 = new Thread(new TwoNum(7500, 10000));

    TN1.start();
    try
    {
      TN1.join();
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }
    TN2.start();
    try
    {
      TN2.join();
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }
    TN3.start();
    try
    {
      TN3.join();
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }
    TN4.start();
    try
    {
      TN4.join();
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }

  }
}
