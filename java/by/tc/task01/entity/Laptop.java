package by.tc.task01.entity;

import java.util.Iterator;
import java.util.LinkedList;

public class Laptop extends Appliance{
	private String batteryCapacity;
	private String os;
	private String memoryRom;
	private String systemMemory;
	private String cpu;
	private String displayInchs;

	@Override
	public void setFields(LinkedList<String> values) {
		Iterator<String> iterator = values.iterator();
		batteryCapacity = iterator.next();
		os = iterator.next();
		memoryRom = iterator.next();
		systemMemory = iterator.next();
		cpu = iterator.next();
		displayInchs = iterator.next();
	}

	@Override
	public String toString() {
		return "Laptop{" +
				"batteryCapacity='" + batteryCapacity + '\'' +
				", os='" + os + '\'' +
				", memoryRom='" + memoryRom + '\'' +
				", systemMemory='" + systemMemory + '\'' +
				", cpu='" + cpu + '\'' +
				", displayInchs='" + displayInchs + '\'' +
				'}';
	}
}
