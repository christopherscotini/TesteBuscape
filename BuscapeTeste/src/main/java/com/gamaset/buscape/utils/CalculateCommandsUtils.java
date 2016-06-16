package com.gamaset.buscape.utils;

import com.gamaset.buscape.constants.AxisConstants;
import com.gamaset.buscape.constants.CommandConstants;
import com.gamaset.buscape.constants.DirectionConstants;
import com.gamaset.buscape.entity.SubmarineEntity;

public class CalculateCommandsUtils {
	
	
	public static SubmarineEntity calculate(SubmarineEntity sub, char[] commands){
		for (int i = 0; i < commands.length; i++) {
			action(sub, String.valueOf(commands[i]));
		}
		return sub;
	}
	
	private static void action(SubmarineEntity sub, String comm){
		if(comm.equalsIgnoreCase(CommandConstants.L) || comm.equalsIgnoreCase(CommandConstants.R)){
			turn(sub, comm);
		}else if(comm.equalsIgnoreCase(CommandConstants.M)){
			move(sub, comm);
		}else if(comm.equalsIgnoreCase(CommandConstants.U) || comm.equalsIgnoreCase(CommandConstants.D)){
			upDown(sub, comm);
		}
	}
	
	private static void turn(SubmarineEntity sub, String comm){
		if(comm.equals(CommandConstants.L)){
			if(sub.getDirectionSubmarine().equals(DirectionConstants.NORTH)){
				sub.setDirectionSubmarine(DirectionConstants.WEST);
			}else if(sub.getDirectionSubmarine().equals(DirectionConstants.SOUTH)){
				sub.setDirectionSubmarine(DirectionConstants.EAST);
			}else if(sub.getDirectionSubmarine().equals(DirectionConstants.EAST)){
				sub.setDirectionSubmarine(DirectionConstants.NORTH);
			}else{
				sub.setDirectionSubmarine(DirectionConstants.SOUTH);
			}
		}else{
			if(sub.getDirectionSubmarine().equals(DirectionConstants.NORTH)){
				sub.setDirectionSubmarine(DirectionConstants.EAST);
			}else if(sub.getDirectionSubmarine().equals(DirectionConstants.SOUTH)){
				sub.setDirectionSubmarine(DirectionConstants.WEST);
			}else if(sub.getDirectionSubmarine().equals(DirectionConstants.EAST)){
				sub.setDirectionSubmarine(DirectionConstants.SOUTH);
			}else{
				sub.setDirectionSubmarine(DirectionConstants.NORTH);
			}
		}
	}
	
	private static void move(SubmarineEntity sub, String comm){
		if(sub.getDirectionSubmarine().equals(DirectionConstants.NORTH)){
			add(sub, AxisConstants.Y);
		}else if(sub.getDirectionSubmarine().equals(DirectionConstants.SOUTH)){
			subtract(sub, AxisConstants.Y);
		}else if(sub.getDirectionSubmarine().equals(DirectionConstants.EAST)){
			add(sub, AxisConstants.X);
		}else{
			subtract(sub, AxisConstants.X);
		}
	}
	
	private static void upDown(SubmarineEntity sub, String comm){
		if(comm.equals(CommandConstants.U)){
			add(sub, AxisConstants.Z);
		}else{
			subtract(sub, AxisConstants.Z);
		}
	}

	private static void add(SubmarineEntity sub, AxisConstants axis){
		if(axis.equals(AxisConstants.X)){
			sub.setAxisX(sub.getAxisX()+1);
		}else if(axis.equals(AxisConstants.Y)){
			sub.setAxisY(sub.getAxisY()+1);
		}else{
			sub.setAxisZ(sub.getAxisZ()+1);
		}
	}

	private static void subtract(SubmarineEntity sub, AxisConstants axis){
		if(axis.equals(AxisConstants.X)){
			sub.setAxisX(sub.getAxisX()-1);
		}else if(axis.equals(AxisConstants.Y)){
			sub.setAxisY(sub.getAxisY()-1);
		}else{
			sub.setAxisZ(sub.getAxisZ()-1);
		}
	}
}
