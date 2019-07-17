/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;
import Command.objects.*;
import Command.interfaces.*;
/**
 *
 * @author jvega
 */

//This pattern allow to control the execution of multiple different task on the same interface
//when you do so then you can verify all the task and find out which one fails and which one not
//Make the things easier.

public class DessignPatterns {
    public static void main(String[] args)
    {
         Command turnOnLights = new TurnOnLights();
         Command turnOffLights = new TurnOffLights();
         Command turnOffFan = new TurnOffFan();
         Command setHightFan = new SetHightFan();
         
         RemoteControl remoteControl = new RemoteControl();
         
         remoteControl.SetCommand("turnOnLights",turnOnLights);
         remoteControl.SetCommand("turnOffLights",turnOffLights);
         remoteControl.SetCommand("turnOffFan",turnOffFan);
         remoteControl.SetCommand("setHightFan",setHightFan);
         
         remoteControl.ButtonPush("turnOnLights");
         
         remoteControl.UndoLastButton();
         
         
    }
}
