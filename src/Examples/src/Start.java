package Examples.src;

import Examples.src.observers.*;
import Examples.src.subject.TrafficLight;

public class Start {
    public static void main(String[] args) throws InterruptedException {
        TrafficLight light = new TrafficLight();
        LightObserver car1 = new Car(1);
        LightObserver car2 = new Car(2);
        LightObserver car3 = new SpeedyCar(3);
        LightObserver car4 = new Taxi(4);
        LightObserver car5 = new SD(5);
        light.addObserver(car1);
        light.addObserver(car2);
        light.addObserver(car3);
        light.addObserver(car4);
        light.addObserver(car5);
        light.start();

    }
}
