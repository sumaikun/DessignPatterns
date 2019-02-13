/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer.interfaces;

/**
 *
 * @author jvega
 */
public interface Subject {
    
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
    
}
