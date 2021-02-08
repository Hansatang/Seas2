import java.util.Scanner;

public class PokeMan implements Runnable
{
  private Thread bearThread;

  public PokeMan(Thread bearThread)
  {
    this.bearThread = bearThread;
  }

  @Override public void run()
  {
    bearThread.start();
    Scanner input = new Scanner(System.in);

    System.out.println("Do you want to poke a bear ?");
    String answer = input.nextLine();

    try
    {

      if (answer.equals("yes"))
      {
        bearThread.interrupt();
      }
    }
    finally
    {
      Thread.currentThread().interrupt();
    }

  }
}
