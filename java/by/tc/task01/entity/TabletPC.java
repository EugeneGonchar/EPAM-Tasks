package by.tc.task01.entity;

import java.util.Iterator;
import java.util.LinkedList;

public class TabletPC extends Appliance{
	private String batteryCapacity;
	private String displayInchs;
	private String memoryRom;
	private String flashMemoryCapacity;
	private String color;

	@Override
	public void setFields(LinkedList<String> values) {
		Iterator<String> iterator = values.iterator();
		batteryCapacity = iterator.next();
		displayInchs = iterator.next();
		memoryRom = iterator.next();
		flashMemoryCapacity = iterator.next();
		color = iterator.next();
	}

	@Override
	public String toString() {
		return "TabletPC{" +
				"batteryCapacity='" + batteryCapacity + '\'' +
				", displayInchs='" + displayInchs + '\'' +
				", memoryRom='" + memoryRom + '\'' +
				", flashMemoryCapacity='" + flashMemoryCapacity + '\'' +
				", color='" + color + '\'' +
				'}';
	}
}
