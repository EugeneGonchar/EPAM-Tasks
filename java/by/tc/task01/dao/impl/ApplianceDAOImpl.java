package by.tc.task01.dao.impl;

import java.util.ArrayList;
import java.util.Objects;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.utils.LineAnalyzer;
import by.tc.task01.utils.TxtFileReader;
import by.tc.task01.utils.command.Command;
import by.tc.task01.utils.command.CommandProvider;

public class ApplianceDAOImpl implements ApplianceDAO{
	String categoryOfGoods;
	TxtFileReader txtFileReader;
	LineAnalyzer lineAnalyzer;
	Appliance appliance;
	ArrayList<Appliance> applianceList;
	
	public <E> void findByCriteria(Criteria<E> criteria) {
		if(lineAnalyzer.isMeetsTheCriteria(criteria)) {
			CommandProvider provider = new CommandProvider();
			Command command = provider.getCommand(categoryOfGoods);
			appliance = command.execute();
			
			appliance.setFields(lineAnalyzer.getPropertyValues());
			
			applianceList.add(appliance);
		}
	}
	
	public <E> void findByWholeLine(Criteria<E> criteria) {
		if(lineAnalyzer.isContainsCategoryOfGoods(categoryOfGoods)) {
			findByCriteria(criteria);
		}
	}
	
	public <E> ArrayList<Appliance> find(Criteria<E> criteria) {
		txtFileReader = new TxtFileReader();
		applianceList = new ArrayList<Appliance>();
		
		while(txtFileReader.getLine() != null) {
			
			lineAnalyzer = new LineAnalyzer(txtFileReader.getLine());
			categoryOfGoods = lineAnalyzer.findCategoryOfGoods();
			
			if(Objects.isNull(criteria.getGroupSearchName())) {
				findByCriteria(criteria);
			} else {
				findByWholeLine(criteria);
			}
			
			txtFileReader.readNextLine();
		}
		
		return applianceList;
	}
}


//you may add your own new classes