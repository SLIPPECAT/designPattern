package com.example.designpattern.commandPattern.command;

import com.example.designpattern.commandPattern.model.Light;

public class LightOnCommand implements Command{

	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}

}
