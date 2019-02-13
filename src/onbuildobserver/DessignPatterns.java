/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package onbuildobserver;
import onbuildobserver.objects.*;
/**
 *
 * @author jvega
 */

//The java Observable class allow me to implement multiple observable and observer elements based on java api
public class DessignPatterns {
    
    public static void main(String[] args)
    {       
        SubjectClass subject = new SubjectClass();
        
        ConcreteObserver observer1 = new ConcreteObserver();
        
        ConcreteObserver2 observer2 = new ConcreteObserver2();
        
        subject.addObserver(observer1);
        
        subject.addObserver(observer2);        
        
        subject.notify_to_observers();
        
        subject.deleteObserver(observer2);     
        
        subject.notify_to_observers2();
        
    }
    
}
