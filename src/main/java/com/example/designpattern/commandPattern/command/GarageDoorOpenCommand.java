package com.example.designpattern.commandPattern.command;

import com.example.designpattern.commandPattern.model.GarageDoor;

public class GarageDoorOpenCommand implements Command{

	GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor){
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.up();
	}
}
