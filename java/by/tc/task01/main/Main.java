package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		Appliance appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria<Oven> criteriaOven = new Criteria<Oven>(Oven.class);
		criteriaOven.add(Oven.CAPACITY.toString(), 33);


		ArrayList<Appliance> applianceList = service.find(criteriaOven);
		PrintApplianceInfo.print(applianceList);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria<Oven>(Oven.class);
		criteriaOven.add(Oven.HEIGHT.toString(), 40);
		criteriaOven.add(Oven.DEPTH.toString(), 60);

		applianceList = service.find(criteriaOven);
		PrintApplianceInfo.print(applianceList);

		//////////////////////////////////////////////////////////////////

		Criteria<TabletPC> criteriaTabletPC = new Criteria<TabletPC>(TabletPC.class);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 16000);

		applianceList = service.find(criteriaTabletPC);
		PrintApplianceInfo.print(applianceList);

		//////////////////////////////////////////////////////////////////

		Criteria<Object> criteriaTabletPC1 = new Criteria<Object>();
		criteriaTabletPC1.add(TabletPC.MEMORY_ROM.toString(), 8000);

		applianceList = service.find(criteriaTabletPC1);
		PrintApplianceInfo.print(applianceList);


		
		long timeSpent = System.currentTimeMillis() - startTime;
		System.out.println("программа выполнялась " + timeSpent + " миллисекунд");
	}

}
