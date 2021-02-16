package L1;

public class TwoNumTest
{
  public static void main(String[] args)
  {
    Thread TN1 = new Thread(new TwoNum(0, 25000,null));
    Thread TN2 = new Thread(new TwoNum(25000, 50000,TN1));
    Thread TN3 = new Thread(new TwoNum(50000, 75000,TN2));
    Thread TN4 = new Thread(new TwoNum(75000, 100000,TN3));

    TN1.start();
    TN2.start();
    TN3.start();
    TN4.start();
//    TN1.start();
//    try
//    {
//      TN1.join();
//    }
//    catch (InterruptedException e)
//    {
//      e.printStackTrace();
//    }
//    TN2.start();
//    try
//    {
//      TN2.join();
//    }
//    catch (InterruptedException e)
//    {
//      e.printStackTrace();
//    }
//    TN3.start();
//    try
//    {
//      TN3.join();
//    }
//    catch (InterruptedException e)
//    {
//      e.printStackTrace();
//    }
//    TN4.start();
//    try
//    {
//      TN4.join();
//    }
//    catch (InterruptedException e)
//    {
//      e.printStackTrace();
//    }

  }
}
