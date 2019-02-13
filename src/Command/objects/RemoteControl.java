/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command.objects;
import Command.interfaces.*;
import java.util.HashMap;
/**
 *
 * @author jvega
 */
public class RemoteControl {
 
    
    HashMap<String, Command> CommandsMap = new HashMap<String, Command>();
    
    private Command currentCommand;
    
    public void SetCommand(String key, Command command)
    {
        CommandsMap.put(key, command);
    }
    
    
    public void ButtonPush(String key)
    {
        this.currentCommand = CommandsMap.get(key); 
        this.currentCommand.execute();
    }
    
    public void UndoLastButton()
    {
        this.currentCommand.undo();
    }
    
}
