package Examples2.src.observers;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class SD implements PropertyChangeListener
{

  private int id;

  public SD(int id)
  {
    this.id = id;
  }

  public void setLight(PropertyChangeEvent evt)
  {
    if ("GREEN".equals(evt.getNewValue()))
    {
      System.out.println("Sl " + id + " turns engine on");
    }
    else if ("YELLOW".equals(evt.getNewValue()))
    {
      if ("RED".equals(evt.getOldValue()))
      {
        System.out.println("Sl " + id + " waits");
      }
      else
      {
        System.out.println("SL " + id + " drives");
      }
    }
    else if ("RED".equals(evt.getNewValue()))
    {
      System.out.println("SL " + id + " stops");
    }

  }

  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    setLight(evt);
  }
}
