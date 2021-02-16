package Examples2.src.observers;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Pedestrian implements PropertyChangeListener
{

  private int id;

  public Pedestrian(int id)
  {
    this.id = id;
  }

  public void setLight(PropertyChangeEvent evt)
  {
    if ("GREEN".equals(evt.getNewValue()))
    {
      System.out.println("Pedestrian  " + id + " waits");
    }
    else if ("YELLOW".equals(evt.getNewValue()))
    {
      if ("RED".equals(evt.getOldValue()))
      {
        System.out.println("Car " + id + " gets ready to cross");
      }
      else
      {
        System.out.println("Car " + id + " runs faster");
      }
    }
    if ("RED".equals(evt.getNewValue()))
    {
      System.out.println("Pedestrian  " + id + " goes");
    }

  }

  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    setLight(evt);
  }
}
