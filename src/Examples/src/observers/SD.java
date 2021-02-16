package Examples.src.observers;

public class SD implements LightObserver
{
  private String previousLight;
  private int id;

  public SD(int id)
  {
    this.id = id;
  }

  public void setLight(String currentLight)
  {
    if ("GREEN".equals(currentLight))
    {
      System.out.println("Sl " + id + " turns engine on");
    }
    else if ("YELLOW".equals(currentLight))
    {
      if ("RED".equals(previousLight))
      {
        System.out.println("Sl " + id + " waits");
      }
      else
      {
        System.out.println("SL " + id + " drives");
      }
    }
    else if ("RED".equals(currentLight))
    {
      System.out.println("SL " + id + " stops");
    }
    previousLight = currentLight;
  }
}
