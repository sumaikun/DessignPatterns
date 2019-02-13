/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer.objects;
import Observer.interfaces.*;
/**
 *
 * @author jvega
 */
public class ConcreteObserver1 implements Observer{

    @Override
    public void update(Object args) {
        System.out.println("observer1 "+args.toString());                
    }
    
}
