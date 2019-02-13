/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command.interfaces;
import Command.objects.*;
/**
 *
 * @author jvega
 */
public class SetHightFan implements Command{
    
    CeilingFan fan = new CeilingFan();

    @Override
    public void execute() {
        fan.Off();
    }

    @Override
    public void undo() {
        int speed = fan.getSpeed()-1;
        fan.SwitchTo(speed);
    }
    
}
