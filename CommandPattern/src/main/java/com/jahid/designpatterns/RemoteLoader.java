package com.jahid.designpatterns;

import com.jahid.designpatterns.appliances.*;
import com.jahid.designpatterns.commands.*;

/**
 * Created by jahidul.s on 2/25/2015.
 */
public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan livingRoomCeilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();
        TV tv = new TV();
        Hottub hottub = new Hottub();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanMediumCommand livingRoomFanMedium = new CeilingFanMediumCommand(livingRoomCeilingFan);
        CeilingFanHighCommand livingRoomFanHigh = new CeilingFanHighCommand(livingRoomCeilingFan);
        CeilingFanOffCommand livingRoomFanOff = new CeilingFanOffCommand(livingRoomCeilingFan);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCdCommand stereoOnWithCd = new StereoOnWithCdCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        TvOnCommand tvOn = new TvOnCommand(tv);
        TvOffCommand tvOff = new TvOffCommand(tv);

        HotTubOnCommand hotTubOn = new HotTubOnCommand(hottub);
        HotTubOffCommand hotTubOff = new HotTubOffCommand(hottub);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, livingRoomFanHigh, livingRoomFanOff);
        remoteControl.setCommand(3, garageDoorUp, garageDoorDown);
        remoteControl.setCommand(4, stereoOnWithCd, stereoOff);

        /*System.out.println(remoteControl);

        for (int i = 0; i < RemoteControl.MAX_SLOTS; i++) {
            remoteControl.onButtonPushed(i);
            remoteControl.offButtonPushed(i);
        }

        System.out.println();*/

        /*remoteControl.setCommand(5, livingRoomFanMedium, livingRoomFanOff);

        remoteControl.onButtonPushed(2);
        remoteControl.offButtonPushed(2);
        System.out.println(remoteControl);
        remoteControl.undoButtonPushed();
        remoteControl.onButtonPushed(5);
        System.out.println(remoteControl);
        remoteControl.undoButtonPushed();*/

        Command[] partyOn = new Command[] { livingRoomLightOn, stereoOnWithCd, tvOn, hotTubOn };
        Command[] partyOff = new Command[] { livingRoomLightOff, stereoOff, tvOff, hotTubOff };

        MacroCommand partyOnCommand = new MacroCommand(partyOn);
        MacroCommand partyOffCommand = new MacroCommand(partyOff);

        remoteControl.setCommand(5, partyOnCommand, partyOffCommand);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On ---");
        remoteControl.onButtonPushed(5);
        System.out.println("--- Pushing Macro Off ---");
        remoteControl.offButtonPushed(5);
        remoteControl.undoButtonPushed();
    }
}
