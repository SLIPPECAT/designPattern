package com.example.designpattern.commandPattern.command;

import com.example.designpattern.commandPattern.model.CeilingFan;

public class CeilingFanOffCommand implements Command{
	CeilingFan ceilingFan;

	public CeilingFanOffCommand(CeilingFan ceilingFan){ this.ceilingFan = ceilingFan; }

	public void execute() { ceilingFan.off(); }

}
