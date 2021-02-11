import java.awt.*;
import java.util.ArrayList;

public class Starter
{

  public static void main(String[] args)
  {
    Thread TN1 = new Thread(new Bear("John"));
    Thread TN2 = new Thread(new Bear("Mike"));
    Thread TN3 = new Thread(new Bear("Zlatan"));
    Thread TN4 = new Thread(new Bear("Vic"));

    ArrayList<Thread> list = new ArrayList<Thread>();;
    list.add((TN1));
    list.add((TN2));
    list.add((TN3));
    list.add((TN4));

    Thread TN5 = new Thread(new PokeMan(list));


    TN1.start();
    TN2.start();
    TN3.start();
    TN4.start();
    TN5.start();



  }
}
