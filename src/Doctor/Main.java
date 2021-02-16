package Doctor;

public class Main
{
  public static void main(String[] args) throws InterruptedException
  {
    WaitingRoom w1 = new WaitingRoom();
    Patient p1 = new Patient(4, w1.getPropertyChangeSupport());
    Patient p2 = new Patient(11, w1.getPropertyChangeSupport());
    Patient p3 = new Patient(15, w1.getPropertyChangeSupport());

    Thread t1 = new Thread(w1);
    try
    {
      t1.start();
      w1.addPropertyChangeListener(p1);
      w1.addPropertyChangeListener(p2);


      Thread.sleep(5000);
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }
    finally
    {
      w1.addPropertyChangeListener(p3);
    }

  }
}
