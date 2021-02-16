package Doctor;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class WaitingRoom implements PropertyChangeSubject,Runnable
{
  PropertyChangeSupport propertyChangeSupport;
  private int count;

  public WaitingRoom()
  {
    count = 0;
    propertyChangeSupport = new PropertyChangeSupport(this);
  }

  public PropertyChangeSupport getPropertyChangeSupport()
  {
    return propertyChangeSupport;
  }

  private void numberChanged(int previous, int current)
  {
    propertyChangeSupport
        .firePropertyChange("NumberChanged", previous, current);
  }

  @Override public void addPropertyChangeListener(
      PropertyChangeListener listener)
  {
    Patient temp = (Patient) listener;
    System.out.println("Patient " + temp.getTicketNumber() + " enters the waiting room");
    propertyChangeSupport.addPropertyChangeListener(listener);

    listener.propertyChange(
        new PropertyChangeEvent(this, "NumberChanged", count, count));

  }

  @Override public void run()
  {
    for (int i = 0; i < 20; i++)
    {
      int previous = i - 1;
      count = i;
      System.out.println("\nCurrent number is " + count);
      numberChanged(previous, count);
//      System.out.println("amount of listeners "+ propertyChangeSupport
//          .getPropertyChangeListeners().length);
      try
      {
        Thread.sleep(1000);
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }
//    System.out.println("          AMOUNT of listeners "+ propertyChangeSupport
//        .getPropertyChangeListeners().length);
  }
}
