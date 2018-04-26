package by.tc.task01.entity;

import java.util.Iterator;
import java.util.LinkedList;

public class Oven extends Appliance{
	private String powerConsumption;
	private String weight;
	private String capacity;
	private String depth;
	private String height;
	private String width;

    @Override
	public void setFields(LinkedList<String> values) {
		Iterator<String> iterator = values.iterator();
		powerConsumption = iterator.next();
		weight = iterator.next();
		capacity = iterator.next();
		depth = iterator.next();
		height = iterator.next();
		width = iterator.next();
	}

    @Override
    public String toString() {
        return "Oven{" +
                "powerConsumption='" + powerConsumption + '\'' +
                ", weight='" + weight + '\'' +
                ", capacity='" + capacity + '\'' +
                ", depth='" + depth + '\'' +
                ", height='" + height + '\'' +
                ", width='" + width + '\'' +
                '}';
    }
}
