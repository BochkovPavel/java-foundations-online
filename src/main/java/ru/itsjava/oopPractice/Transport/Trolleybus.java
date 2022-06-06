package ru.itsjava.oopPractice.Transport;

public class Trolleybus extends CityTransport {
    public Trolleybus(String type, String route, double cost) {
        super(type, route, cost);
    }

    @Override
    public String toString() {
        return (getType() + "\t" + getRoute() + "\t" + getCost());
    }
}
