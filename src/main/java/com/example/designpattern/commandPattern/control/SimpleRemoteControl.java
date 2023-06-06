package com.example.designpattern.commandPattern.control;

import com.example.designpattern.commandPattern.command.Command;

public class SimpleRemoteControl {

	Command slot;

	public SimpleRemoteControl() {}

	public void setCommand(Command command){
		slot = command;
	}

	public void buttonWasPressed(){
		slot.execute();
	}

}
