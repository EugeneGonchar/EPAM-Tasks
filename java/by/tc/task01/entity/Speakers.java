package by.tc.task01.entity;

import java.util.Iterator;
import java.util.LinkedList;

public class Speakers extends Appliance{
	private String powerConsumption;
	private String numberOfSpeakers;
	private String frequencyRange;
	private String cordLength;

    @Override
	public void setFields(LinkedList<String> values) {
		Iterator<String> iterator = values.iterator();
		powerConsumption = iterator.next();
		numberOfSpeakers = iterator.next();
		frequencyRange = iterator.next();
		cordLength = iterator.next();
	}

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption='" + powerConsumption + '\'' +
                ", numberOfSpeakers='" + numberOfSpeakers + '\'' +
                ", frequencyRange='" + frequencyRange + '\'' +
                ", cordLength='" + cordLength + '\'' +
                '}';
    }
}
