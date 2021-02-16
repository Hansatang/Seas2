package L1;

public class TRStarter
{
  public static void main(String[] args)
  {
    Turtle turtle = new Turtle();
    Rabbit rabbit = new Rabbit(turtle);
    Thread TN1 = new Thread(turtle);
    Thread TN2 = new Thread(rabbit);

    TN1.start();
    TN2.start();
  }
}
