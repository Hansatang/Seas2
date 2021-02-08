public class Starter
{
  public static void main(String[] args)
  {
    Thread TN1 = new Thread(new Bear());
    Thread TN2 = new Thread(new PokeMan(TN1));

    TN2.start();


  }
}
