package ru.itsjava.oopPractice.Transport;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CityTransport {
    private final String type;
    private final String route;
    private final double cost;

    @Override
    public String toString() {
        return (getType() + "\t" + getRoute() + "\t" + getCost());
    }
}
