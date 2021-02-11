package Bar;

public class Bartender implements Runnable
{
  private String name;
  private Bar bar;

  public Bartender(String name, Bar bar)
  {
    this.name = name;
    this.bar = bar;
  }

  @Override public void run()
  {
    while (bar.isOpen())
    {
      bar.placeBeer(new Beer());
    }

  }
}
