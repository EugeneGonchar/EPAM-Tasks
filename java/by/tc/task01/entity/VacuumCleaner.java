package by.tc.task01.entity;

import java.util.Iterator;
import java.util.LinkedList;

public class VacuumCleaner extends Appliance{
	private String powerConsumption;
	private String filterType;
	private String bagType;
	private String wandType;
	private String motorSpeedRegulation;
	private String cleaningWidth;

	@Override
	public void setFields(LinkedList<String> values) {
		Iterator<String> iterator = values.iterator();
		powerConsumption = iterator.next();
		filterType = iterator.next();
		bagType = iterator.next();
		wandType = iterator.next();
		motorSpeedRegulation = iterator.next();
		cleaningWidth = iterator.next();
	}

	@Override
	public String toString() {
		return "VacuumCleaner{" +
				"powerConsumption='" + powerConsumption + '\'' +
				", filterType='" + filterType + '\'' +
				", bagType='" + bagType + '\'' +
				", wandType='" + wandType + '\'' +
				", motorSpeedRegulation='" + motorSpeedRegulation + '\'' +
				", cleaningWidth='" + cleaningWidth + '\'' +
				'}';
	}
}
