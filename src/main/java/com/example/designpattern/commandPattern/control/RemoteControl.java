package com.example.designpattern.commandPattern.control;

import com.example.designpattern.commandPattern.command.Command;
import com.example.designpattern.commandPattern.command.NoCommand;

public class RemoteControl {
	Command noCommand = new NoCommand();

	Command[] onCommands;
	Command[] offCommands;

	public RemoteControl(){
		onCommands= new Command[7];
		offCommands= new Command[7];

		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}

	public void setCommand(int slot, Command onCommand, Command offCommand){
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot){
		onCommands[slot].execute();
	}

	public void offButtonWasPushed(int slot){
		offCommands[slot].execute();
	}

	public String toString(){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n------리모컨------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName()
				+ "    " + offCommands[i].getClass().getName() + "\n");
		}
		return stringBuffer.toString();
	}
}
