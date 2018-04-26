package by.tc.task01.utils.command;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
	public Map<String, Command> commands = new HashMap<String, Command>();
	
	public CommandProvider(){
		commands.put("Laptop", new LaptopCommand());
		commands.put("Oven", new OvenCommand());
		commands.put("Refrigerator", new RefrigeratorCommand());
		commands.put("Speakers", new SpeakersCommand());
		commands.put("TabletPC", new TabletPCCommand());
		commands.put("VacuumCleaner", new VacuumCleanerCommand());
	}
	
	public Command getCommand(String key) {
		return commands.get(key);
	}
}
