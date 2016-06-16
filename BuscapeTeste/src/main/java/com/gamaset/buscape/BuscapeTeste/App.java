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
		if (args.length < 1 || args[0] == null) {
			printUsage();
			return;
		}else{
			System.out.println("== Commands ==\n["+args[0]+"]\n");
			System.out.println("== Initial Position ==\n[0,0,0,NORTH]\n");
			char[] commands = args[0].toCharArray();
			System.out.println("== Final Position ==\n"+execute(commands));
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
