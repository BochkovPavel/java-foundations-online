package ru.itsjava.oopPractice.Transport;

public class Tram extends CityTransport {
    public Tram(String type, String route, double cost) {
        super(type, route, cost);
    }

    @Override
    public String toString() {
        return (getType() + "\t" + getRoute() + "\t" + getCost());
    }
}
