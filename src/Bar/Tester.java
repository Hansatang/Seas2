package Bar;

public class Tester
{
  public static void main(String[] args)
  {
    Bar bar = new Bar(20);
    Thread b1 = new Thread( new Bartender("John",bar));
    Thread b2 = new Thread( new Bartender("Mike",bar));
    Thread b3 = new Thread( new Bartender("Victor",bar));
    Thread c1 = new Thread( new Customer(bar,"Wolo"));
    Thread c2 = new Thread( new Customer(bar,"Luka"));

    b1.start();
    c1.start();
    b2.start();
    c2.start();
    b3.start();

   try
   {
     System.out.println("lol"+ Thread.currentThread().getName());
     Thread.sleep(1000);
   }
   catch (InterruptedException e)
   {
     e.printStackTrace();
   }
   finally
   {
     bar.setOpen(false);
   }
  }
}
