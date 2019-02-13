/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import strategy.interfaces.*;
import strategy.objects.*;

/**
 *
 * @author jvega
 */

//This pattern show the advantages of composition over inheration.
//It is important to know that if there is a common behavior, this doesn´t mean that the concrete implementations
//must be coded on the same place that in the class object is better make this changes without touch de initial classes 
//This pattern let us to change the behavior of a object property on run time.
//It is better to make expandible objects than 'rewritable' objects each time something changes.
public class DessignPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AnyAbstractClass anyinstance;
        
        FirstBehaviorFirstImp firstbfi = new FirstBehaviorFirstImp();
        
        FirstBehaviorSecondImp firstbsi = new FirstBehaviorSecondImp();
        
        SecondBehaviorFirstImp secondbfi = new SecondBehaviorFirstImp();
        
        SecondBehaviorSecondImp secondbsi = new SecondBehaviorSecondImp();
        
        anyinstance = new ChildOne();
        
        anyinstance.sharemethod();
        
        // First Behavior
        
        anyinstance.setFirstbehavior(firstbfi);
        
        anyinstance.firstbehaviorexecution();
        
        anyinstance.setFirstbehavior(firstbsi);
        
        anyinstance.firstbehaviorexecution();
        
        // Second Behavior        
        
        anyinstance.setSecondbehavior(secondbfi);
        
        anyinstance.secondbehaviorexecution();
        
        anyinstance.setSecondbehavior(secondbsi);
        
        anyinstance.secondbehaviorexecution();
        
        
        
    }
}
