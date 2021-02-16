package SM;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ScoreBoard implements PropertyChangeListener
{
  private int dreamTeamScore = 0;
  private int oldTeamScore = 0;

  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    count(evt);
  }

  private void count(PropertyChangeEvent evt)
  {
    if (evt.getPropertyName().equals("Score"))
    {
      if (0 == (int) evt.getNewValue())
      {
        dreamTeamScore++;
        System.out.println("Score board "+dreamTeamScore+":"+oldTeamScore);
      }
      else if (1 == (int) evt.getNewValue())
      {
        oldTeamScore++;
        System.out.println("Score board "+dreamTeamScore+":"+oldTeamScore);
      }
    }
  }
}


