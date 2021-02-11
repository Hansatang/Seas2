package Bar;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Bar
{
  private boolean isOpen;
  private int count;
  private ArrayList<Beer> beerArrayList;

  public Bar(int count)
  {
    this.isOpen = true;
    this.count = count;
    this.beerArrayList = new ArrayList<Beer>();
  }

  public boolean isOpen()
  {
    return isOpen;
  }

  public void setOpen(boolean open)
  {
    isOpen = open;
  }

  public synchronized int counter()
  {
    return beerArrayList.size();
  }

  public synchronized void placeBeer(Beer b){

    while (beerArrayList.size() >= count)
    {
      try
      {
        wait();
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }
    beerArrayList.add(b);
    System.out.println("Bart placed a beer");
    System.out.println("beers "+counter());
    notifyAll();
    try
    {
      Thread.sleep(100);
    }
    catch (InterruptedException e)
    {
      System.out.println( "Final "+counter());
    }

  }

  public synchronized void takeBeer(){
    while (beerArrayList.size() <= 0)
    {
      try
      {
        wait();
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }
    beerArrayList.remove(0);
    System.out.println("Cust takes a beer");
    System.out.println("beers"+counter());
    notifyAll();
    try
    {
      Thread.sleep(100);
    }
    catch (InterruptedException e)
    {
      System.out.println( "Final "+counter());
    }
  }
}
