package com.example.designpattern.commandPattern.command;

import com.example.designpattern.commandPattern.model.Stereo;

public class StereoOnWithCdCommand implements Command{

	Stereo stereo;

	public StereoOnWithCdCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	public void execute() {
		stereo.on();
		stereo.setCd();
		stereo.setVolume(11);
	}
}
