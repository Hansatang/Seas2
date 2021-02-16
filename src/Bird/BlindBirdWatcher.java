package Bird;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class BlindBirdWatcher implements PropertyChangeListener
{
  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    blindAwe(evt);
  }

  private void blindAwe(PropertyChangeEvent evt)
  {
    if (evt.getPropertyName().equals("Sing"))
    {
      System.out.println("Blindman: Sound nice");
    }
  }
}
