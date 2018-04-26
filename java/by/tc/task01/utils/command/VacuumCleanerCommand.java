package by.tc.task01.utils.command;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;;

public class VacuumCleanerCommand extends Command{

	@Override
	public Appliance execute() {
		return new VacuumCleaner();
	}
	
}
