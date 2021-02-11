package Bar;

public class Customer implements Runnable
{

  private Bar bar;
  private String name;

  public Customer(Bar bar, String name)
  {
    this.bar = bar;
    this.name = name;
  }

  @Override public void run()
  {
    while (bar.isOpen())
    {
      bar.takeBeer();
    }
  }
}
