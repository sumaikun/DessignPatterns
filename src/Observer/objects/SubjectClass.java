/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer.objects;

import Observer.interfaces.*;
import java.util.ArrayList;

/**
 *
 * @author jvega
 */
public class SubjectClass implements Subject {

    private ArrayList<Observer> observers;
    
    public SubjectClass()
    {
        observers = new ArrayList();
    }
    
    
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(0);
    }

    @Override
    public void notifyObserver() {
        for(Observer o:  observers)
        {           
           o.update(this.push_data());
        }
    }
    
    private String push_data()
    {
        return "I am the data supposed to return";
    
    }

    

    
    
}
