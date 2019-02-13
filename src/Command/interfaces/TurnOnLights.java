/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command.interfaces;

import Command.objects.Lights;
/**
 *
 * @author jvega
 */
public class TurnOnLights implements Command{

    Lights l = new Lights();
    
    @Override
    public void execute() {
        l.On();
    }

    @Override
    public void undo() {
        l.Off();
    }

    
    
    
    
}
