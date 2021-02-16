package Examples2.src;

import Examples2.src.observers.Car;
import Examples2.src.observers.Pedestrian;
import Examples2.src.observers.SD;
import Examples2.src.observers.Taxi;
import Examples2.src.subject.TrafficLight;

public class Start {
    public static void main(String[] args) throws InterruptedException {
        TrafficLight light = new TrafficLight();
        Car car1 = new Car(1);
        Car car2 = new Car(2);
        Taxi taxi1 = new Taxi(3);
        Taxi taxi2 = new Taxi(4);
        SD sd1 = new SD(5);
        SD sd2 = new SD(6);
        Pedestrian p1 = new Pedestrian(7);
        Pedestrian p2 = new Pedestrian(8);
        light.addPropertyChangeListener(car1);
        light.addPropertyChangeListener(car2);
        light.addPropertyChangeListener(taxi1);
        light.addPropertyChangeListener(taxi2);
        light.addPropertyChangeListener(sd1);
        light.addPropertyChangeListener(sd2);
        light.addPropertyChangeListener(p1);
        light.addPropertyChangeListener(p2);
        light.start();

    }
}
