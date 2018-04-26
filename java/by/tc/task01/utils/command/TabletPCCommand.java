package by.tc.task01.utils.command;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;

public class TabletPCCommand extends Command{

	@Override
	public Appliance execute() {
		return new TabletPC();
	}
	
}
