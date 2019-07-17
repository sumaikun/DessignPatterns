/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jvega
 */
public class MacroCommand implements Command{

    HashMap<String , Command> commands;
    
    ArrayList<Command> commandsFailed = new ArrayList<Command>();
    
    public MacroCommand(HashMap<String , Command> commands){
        this.commands = commands;
    }
    
    @Override
    public void execute() {
        for (Map.Entry<String, Command> command : this.commands.entrySet()) {
            Command cmd = command.getValue();
            try  
            {  
                cmd.execute(); //may throw exception   
            }  
                // handling the exception by using Exception class      
            catch(Exception e)  
            {  
                System.out.println(e);
                this.store(cmd);
            }            
            
        }
    }

    @Override
    public void undo() {
        //
    }
    
    public void store(Command cmd){
        //Store errors
        this.commandsFailed.add(cmd);
    }
    
    public void load(){
        //Execute errors
    }
}
