package SM;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Referee implements PropertyChangeListener
{
  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    refere(evt);
  }

  public void refere(PropertyChangeEvent evt)
  {
    if (evt.getPropertyName().equals("Tackle"))
    {
      if (0 == (int) evt.getNewValue())
      {
        System.out.println("Referee: Dream team tackled 2");
      }
      else if ((1 == (int) evt.getNewValue()))
      {
        System.out.println("Referee: Old boys tackled 2");
      }
    }
  }
}
