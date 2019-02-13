/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command.interfaces;

/**
 *
 * @author jvega
 */
public interface Command {
    public void execute();
    public void undo();
    //public void store(); only works is data will be save on a persistent db
    //public void load();
}
