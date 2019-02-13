/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.objects;

import strategy.interfaces.*;
/**
 *
 * @author jvega
 */
public abstract  class AnyAbstractClass {
    
    FirstBehavior firstbehavior;
    SecondBehavior secondbehavior;
    
    public void setFirstbehavior(FirstBehavior firstbehavior){
        this.firstbehavior = firstbehavior;
    }
    
    public void setSecondbehavior(SecondBehavior secondbehavior){
        this.secondbehavior = secondbehavior;
    }
    
    public void sharemethod(){
    
        System.out.println("i am a shared method");            
    
    }
    
    public abstract void abstractmethod();
    
    public void firstbehaviorexecution(){
        firstbehavior.execute_first_behavior();
    }
    
    public void secondbehaviorexecution(){
        secondbehavior.execute_second_behavior();
    }
    
    
}
