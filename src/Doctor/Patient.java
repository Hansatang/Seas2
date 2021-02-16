package Doctor;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Patient implements PropertyChangeListener
{
  private int ticketNumber;
  private PropertyChangeSupport pcs;

  public Patient(int ticketNumber, PropertyChangeSupport pcs)
  {
    this.ticketNumber = ticketNumber;
    this.pcs = pcs;
  }

  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    goToRoom(evt);
  }

  private void goToRoom(PropertyChangeEvent evt)
  {
    System.out.println("Patient " + ticketNumber + " looks up");
    if (ticketNumber > (int) evt.getNewValue())
    {
      System.out.println(
          "Patient " + ticketNumber + " goes back to looking at phone");
    }
    else if (ticketNumber == (int) evt.getNewValue())
    {
      System.out.println("Patient " + ticketNumber + " enters doctor's room");
      patientOut();
    }
  }

  private void patientOut()
  {
    pcs.removePropertyChangeListener(this);
    System.out.println("yay");
  }

  public int getTicketNumber()
  {
    return ticketNumber;
  }
}
