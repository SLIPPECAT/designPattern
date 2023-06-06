package com.example.designpattern.commandPattern.command;

import com.example.designpattern.commandPattern.model.CeilingFan;

public class CeilingFanOnCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) { this.ceilingFan = ceilingFan; }

	public void execute(){
		ceilingFan.high();
	}

}
