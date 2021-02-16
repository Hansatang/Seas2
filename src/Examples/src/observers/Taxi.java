package Examples.src.observers;

public class Taxi implements LightObserver
{
  private String previousLight;
  private int id;

  public Taxi(int id)
  {
    this.id = id;
  }

 @Override public void setLight(String currentLight)
  {
    if ("GREEN".equals(currentLight))
    {
      System.out.println("Taxi " + id + " drives");
    }
    else if ("YELLOW".equals(currentLight))
    {
        System.out.println("Taxi " + id + " ignores");
    }
    else if ("RED".equals(currentLight))
    {
      System.out.println("Taxi " + id + " stops");
    }
    previousLight = currentLight;
  }

}
