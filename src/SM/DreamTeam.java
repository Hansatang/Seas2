package SM;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class DreamTeam implements PropertyChangeListener
{
  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    cheering(evt);
  }

  private void cheering(PropertyChangeEvent evt)
  {
    if (evt.getPropertyName().equals("Score"))
    {
      if (0 == (int) evt.getNewValue())
      {
        System.out.println("DFan : Dream Team: gooooo 3");
        System.out.println("DFan : Old Boys:  buuuuuu 3");
      }
    }
  }
}
