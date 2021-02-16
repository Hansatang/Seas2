package Bird;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class BirdWatcher implements PropertyChangeListener
{
  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    awe(evt);
  }

  private void awe(PropertyChangeEvent evt)
  {
    if (evt.getPropertyName().equals("Flip"))
    {
        System.out.println("Watcher: Would you look at that");
    }
    if (evt.getPropertyName().equals("Sing"))
    {
        System.out.println("Watcher: Ooh");
    }
  }
}
