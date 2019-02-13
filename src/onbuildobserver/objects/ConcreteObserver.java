/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package onbuildobserver.objects;
import java.util.Observable;
import java.util.Observer;
/**
 *
 * @author jvega
 */
public class ConcreteObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg);
        System.out.println(o.toString());
        System.out.println("Obs1 ");
    }
    
}
