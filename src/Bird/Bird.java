package Bird;

import Doctor.PropertyChangeSubject;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Random;

public class Bird implements PropertyChangeSubject
{
  PropertyChangeSupport propertyChangeSupport;

  public Bird()
  {
    propertyChangeSupport = new PropertyChangeSupport(this);
  }

  @Override public void addPropertyChangeListener(
      PropertyChangeListener listener)
  {
    propertyChangeSupport.addPropertyChangeListener(listener);
  }

  public void start()
  {
    Random random = new Random();
    for (int i = 0; i < 20; i++)
    {
      int rand = random.nextInt(2);
      if (rand == 0)
      {
       flap();
      }
      else
      {
        sing();
      }
    }
  }

  private void flap()
  {
    System.out.println("Peacock flashes its wings");
    propertyChangeSupport.firePropertyChange("Flip", "0",0 );
  }

  private void sing()
  {
    System.out.println("Peacock whistles");
    propertyChangeSupport.firePropertyChange("Sing", "0",0 );
  }

}

