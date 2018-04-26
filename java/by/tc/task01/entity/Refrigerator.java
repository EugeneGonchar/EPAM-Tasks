package by.tc.task01.entity;

import java.util.Iterator;
import java.util.LinkedList;

public class Refrigerator extends Appliance{
	private String powerConsumption;
	private String weight;
	private String freezerCapacity;
	private String overallCapacity;
	private String height;
	private String width;

    @Override
	public void setFields(LinkedList<String> values) {
		Iterator<String> iterator = values.iterator();
		powerConsumption = iterator.next();
		weight = iterator.next();
		freezerCapacity = iterator.next();
		overallCapacity = iterator.next();
		height = iterator.next();
		width = iterator.next();
	}

    @Override
    public String toString() {
        return "Refrigerator{" +
                "powerConsumption='" + powerConsumption + '\'' +
                ", weight='" + weight + '\'' +
                ", freezerCapacity='" + freezerCapacity + '\'' +
                ", overallCapacity='" + overallCapacity + '\'' +
                ", height='" + height + '\'' +
                ", width='" + width + '\'' +
                '}';
    }
}
