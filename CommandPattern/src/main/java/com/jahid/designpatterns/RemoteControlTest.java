package com.jahid.designpatterns;

import com.jahid.designpatterns.appliances.GarageDoor;
import com.jahid.designpatterns.appliances.Light;
import com.jahid.designpatterns.commands.GarageDoorUpCommand;
import com.jahid.designpatterns.commands.LightOnCommand;

/**
 * Created by jahidul.s on 2/25/2015.
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light("");
        LightOnCommand lightOn = new LightOnCommand(light);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorUpCommand garageOpen = new GarageDoorUpCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonPressed();

        remote.setCommand(garageOpen);
        remote.buttonPressed();
    }
}
