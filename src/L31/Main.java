package L31;

public class Main
{
  public static void main(String[] args)
  {
    Car c1 = new Car(1);
    Car c2 = new Car(2);
    Car c3 = new Car(3);

    TL tl = new TL();
    tl.addCar(c1);
    tl.addCar(c2);
    tl.addCar(c3);
  }
}
