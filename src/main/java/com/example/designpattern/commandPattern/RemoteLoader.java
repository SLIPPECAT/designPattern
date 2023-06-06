package com.example.designpattern.commandPattern;

import com.example.designpattern.commandPattern.command.CeilingFanOffCommand;
import com.example.designpattern.commandPattern.command.CeilingFanOnCommand;
import com.example.designpattern.commandPattern.command.GarageDoorDownCommand;
import com.example.designpattern.commandPattern.command.GarageDoorUpCommand;
import com.example.designpattern.commandPattern.command.LightOffCommand;
import com.example.designpattern.commandPattern.command.LightOnCommand;
import com.example.designpattern.commandPattern.command.StereoOffCommand;
import com.example.designpattern.commandPattern.command.StereoOnWithCdCommand;
import com.example.designpattern.commandPattern.control.RemoteControl;
import com.example.designpattern.commandPattern.model.CeilingFan;
import com.example.designpattern.commandPattern.model.GarageDoor;
import com.example.designpattern.commandPattern.model.Light;
import com.example.designpattern.commandPattern.model.Stereo;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();

		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("Garage");
		Stereo stereo = new Stereo("Living Room");

//		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
//		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		remoteControl.setCommand(0, () -> livingRoomLight.on(), () -> livingRoomLight.off());
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

		GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

		StereoOnWithCdCommand stereoOnWithCd = new StereoOnWithCdCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);

		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, stereoOnWithCd, stereoOff);

		System.out.println(remoteControl);

		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);

	}

}
