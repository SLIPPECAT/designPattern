package com.example.designpattern.commandPattern.command;

import com.example.designpattern.commandPattern.model.Stereo;

public class StereoOffCommand implements Command {
	Stereo stereo;

	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	public void execute(){ stereo.off(); }
}
