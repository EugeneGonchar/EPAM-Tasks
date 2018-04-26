package by.tc.task01.utils;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.tc.task01.entity.criteria.Criteria;

public class LineAnalyzer {
	private String line;
	
	public LineAnalyzer() {
		this("");
	}
	
	public LineAnalyzer(String line) {
		this.line = line;
	}
	
	public String findCategoryOfGoods() {
		String categoryOfGoods = null;
		Matcher matcher = Pattern.compile("^[\\w\\s]+").matcher(line);
		while(matcher.find())
			categoryOfGoods = matcher.group();
		return categoryOfGoods;
	}
	
	public boolean isContainsCategoryOfGoods(String groupSearchName) {
		Matcher matcher = Pattern.compile("^" + groupSearchName + ".*").matcher(line);
		return matcher.matches();
	}
	
	public boolean isMeetsTheCriterion(Entry<String, Object> entry) {
		Matcher matcher = Pattern.compile(".*[,:] " + entry.getKey() + "=" + entry.getValue() + "[,;].*").matcher(line);
		return matcher.matches();
	}
	
	public <E> boolean isMeetsTheCriteria(Criteria<E> criteria) {
		for(Entry<String, Object> entry : criteria.getCriteria().entrySet()) {
			if(!isMeetsTheCriterion(entry))
				return false;
		}
		return true;
	}
	
	public LinkedList<String> getPropertyValues() {
		Matcher matcher = Pattern.compile("=([\\w-.]*)[,;]").matcher(line);
		LinkedList<String> values = new LinkedList<String>();
        while(matcher.find()){
            values.add(matcher.group(1));
        }
		return values;
	}
	
	public String getLine() {
		return line;
	}
}
