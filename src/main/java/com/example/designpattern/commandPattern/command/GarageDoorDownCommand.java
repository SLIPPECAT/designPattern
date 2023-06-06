package com.example.designpattern.commandPattern.command;

import com.example.designpattern.commandPattern.model.GarageDoor;

public class GarageDoorDownCommand {
	GarageDoor garageDoor;

	public GarageDoorDownCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {garageDoor.down();}
}
