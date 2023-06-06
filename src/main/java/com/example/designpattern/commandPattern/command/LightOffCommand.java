package com.example.designpattern.commandPattern.command;

import com.example.designpattern.commandPattern.model.Light;

public class LightOffCommand implements Command {

	Light light;

	public LightOffCommand(Light light){
		this.light = light;
	}

	public void execute(){
		light.off();
	}
}
