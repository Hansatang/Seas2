package SM;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Medic implements PropertyChangeListener
{
  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    help(evt);
  }

  public void help(PropertyChangeEvent evt)
  {
    if (evt.getPropertyName().equals("Tackle"))
    {
      if (0 == (int) evt.getNewValue())
      {
        System.out.println("Medic:  to old team");
      }
      else if ((1 == (int) evt.getNewValue()))
      {
        System.out.println("Medic:  to dream team");
      }
    }
  }
}

