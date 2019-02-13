/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import Observer.objects.*;
/**
 *
 * @author jvega
 */

//Observer DP , this pattern allow me to execute external class since a main base in the implementation of
//subscribers and also unsubscribers.
public class DessignPatterns {
    public static void main(String[] args) {
    
        SubjectClass subject = new SubjectClass();
        
        ConcreteObserver1  obs1 = new ConcreteObserver1();
        
        ConcreteObserver2 obs2 = new ConcreteObserver2();
        
        subject.registerObserver(obs1);
        
        subject.registerObserver(obs2);
        
        subject.notifyObserver();
        
        subject.removeObserver(obs2);
        
        subject.notifyObserver();
        
    }
}
