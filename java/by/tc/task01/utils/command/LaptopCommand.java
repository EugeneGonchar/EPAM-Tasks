package by.tc.task01.utils.command;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;

public class LaptopCommand extends Command{
	
	@Override
	public Appliance execute() {
		return new Laptop();
	}
	
}
