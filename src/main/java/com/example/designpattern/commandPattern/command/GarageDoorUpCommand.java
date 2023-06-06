package com.example.designpattern.commandPattern.command;

import com.example.designpattern.commandPattern.model.GarageDoor;

public class GarageDoorUpCommand {
	GarageDoor garageDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute(){ garageDoor.up(); }
}
