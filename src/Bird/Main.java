package Bird;

public class Main
{
  public static void main(String[] args)
  {
    BlindBirdWatcher bl1 = new BlindBirdWatcher();
    BirdWatcher b1 = new BirdWatcher();
    Bird bird1 = new Bird();

    bird1.addPropertyChangeListener(bl1);
    bird1.addPropertyChangeListener(b1);
    bird1.start();

  }
}
