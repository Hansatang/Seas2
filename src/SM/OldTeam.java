package SM;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class OldTeam implements PropertyChangeListener
{
  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    cheering(evt);
  }

  private void cheering(PropertyChangeEvent evt)
  {
    if (evt.getPropertyName().equals("Score"))
    {
      if (1 == (int) evt.getNewValue())
      {
        System.out.println("OFan: Dream Team: buuuu 4");
        System.out.println("OFan: Old Boys:  gooooooooo 3");
      }
    }
  }
}
