package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria<E> {

	private Class<E> groupSearchName;
	private Map<String, Object> criteria = new HashMap<String, Object>();
	
	public Criteria() {
		this(null);
	}
	
	public Criteria(Class<E> groupSearchName) {
		this.groupSearchName = groupSearchName;
	}
	
	public Class<E> getGroupSearchName(){
		return groupSearchName;
	}

	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}
	
	public String groupSearchName2String() {
		return groupSearchName.getSimpleName();
	}
	
	public String criteriaEntrySet2String() {
		return criteria.entrySet().toString();
	}
	
	public Map<String, Object> getCriteria(){
		return criteria;
	}
	// you may add your own code here
}
