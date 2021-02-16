package L31;

public class Pedestrian
{
  private String previousLight;
  private int id;

  public Pedestrian(int id)
  {
    this.id = id;
  }

  public void setLight(String currentLight)
  {
    if ("GREEN".equals(currentLight))
    {
      System.out.println("Pedestrian  " + id + " waits");
    }
    else if ("YELLOW".equals(currentLight))
    {
      if ("RED".equals(previousLight))
      {
        System.out.println("Car " + id + " gets ready to cross");
      }
      else
      {
        System.out.println("Car " + id + " runs faster");
      }
    }
    if ("RED".equals(currentLight))
    {
      System.out.println("Pedestrian  " + id + " goes");
    }
    previousLight = currentLight;
  }
}
