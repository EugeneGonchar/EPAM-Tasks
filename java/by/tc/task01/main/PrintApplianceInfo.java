package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintApplianceInfo {
	
	public static void print(ArrayList<Appliance> applianceList) {
		Iterator<Appliance> iterator = applianceList.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		System.out.println("-----");
	}
	
	// you may add your own code here

}
