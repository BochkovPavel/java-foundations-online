package ru.itsjava.oopPractice.Transport;

public class Bus extends CityTransport {
    public Bus(String type, String route, double cost) {
        super(type, route, cost);
    }

    @Override
    public String toString() {
        return (getType() + "\t" + getRoute() + "\t" + getCost());
    }

    public Bus changeRoute(String route) {
        return new Bus(getType(), route, getCost());
    }
}
