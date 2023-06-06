//package com.example.designpattern.commandPattern;
//
//import com.example.designpattern.commandPattern.command.GarageDoorOpenCommand;
//import com.example.designpattern.commandPattern.command.LightOnCommand;
//import com.example.designpattern.commandPattern.control.SimpleRemoteControl;
//import com.example.designpattern.commandPattern.model.GarageDoor;
//import com.example.designpattern.commandPattern.model.Light;
//
//public class RemoteControlTest {
//
//	public static void main(String[] args) {
//		SimpleRemoteControl remote = new SimpleRemoteControl();
//		Light light = new Light();
//		GarageDoor garageDoor = new GarageDoor();
//		LightOnCommand lightOn = new LightOnCommand(light);
//		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
//
//		remote.setCommand(lightOn);
//		remote.buttonWasPressed();
//		remote.setCommand(garageOpen);
//		remote.buttonWasPressed();
//	}
//
//}
