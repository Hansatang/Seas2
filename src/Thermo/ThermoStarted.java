package Thermo;


public class ThermoStarted
{
  public static void main(String[] args)
  {
    Thread t = new Thread(new Thermo("robot",15,1));
    Thread t1 = new Thread(new Thermo("kaczka",15,7));

    t.start();
    t1.start();
  }
}
