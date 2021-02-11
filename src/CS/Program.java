package CS;

public class Program implements Runnable
{
  private String program, action;
  private int count;
  private long RUNTIME = 100000;

  public Program(String program, String action, int count)
  {
    this.program = program;
    this.action = action;
    this.count = count;
  }

  @Override public void run()
  {
    for (int i = 0; i < count; i++)
    {
      try
      {
        Thread.sleep(RUNTIME/count);
        System.out.println(program+" wants to "+action);
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }
  }
}
