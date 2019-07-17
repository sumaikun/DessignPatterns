/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter.objects;

import Adapter.interfaces.Duck;
import Adapter.interfaces.Turkey;

/**
 *
 * @author jvega
 */
public class TurkeyDuckAdapter implements Duck{
    
    Turkey currentTurkey; 
    
    public TurkeyDuckAdapter(Turkey currentTurkey)
    {
        this.currentTurkey = currentTurkey;
    }    
    
    @Override
    public void Fly() {
        this.currentTurkey.fly();
    }

    @Override
    public void Swim() {
        this.currentTurkey.swim();
    }

    @Override
    public void Quack() {
        this.currentTurkey.goobling();
    }
    
}
