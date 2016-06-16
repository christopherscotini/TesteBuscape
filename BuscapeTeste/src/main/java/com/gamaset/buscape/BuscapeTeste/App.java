package com.gamaset.buscape.BuscapeTeste;

import static java.lang.System.out;

import com.gamaset.buscape.constants.DirectionConstants;
import com.gamaset.buscape.entity.SubmarineEntity;
import com.gamaset.buscape.utils.CalculateCommandsUtils;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {
		args = new String[1];
		args[0] = "RMMLMMMDDLL";
		if (args.length < 1 || args[0] == null) {
			printUsage();
			return;
		}else{
			System.out.println("initial ==> [0,0,0,NORTH]");
			char[] commands = args[0].toCharArray();
//			System.out.println("COMMANDS["+commands+"]");
			System.out.println(execute(commands));
		}
		
	}
	
	private static SubmarineEntity execute(char[] commands){
		SubmarineEntity sub = new SubmarineEntity(0, 0, 0, DirectionConstants.NORTH);
		
		return CalculateCommandsUtils.calculate(sub, commands);
	}
	
	private static void printUsage() {
		out.println("Use: java -jar csi-watcher-client.jar <commands -> RMMLMMMDDLL>");
	}
	
}
