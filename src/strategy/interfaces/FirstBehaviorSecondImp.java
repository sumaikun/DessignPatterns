/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.interfaces;

/**
 *
 * @author jvega
 */
public class FirstBehaviorSecondImp implements FirstBehavior{

    @Override
    public void execute_first_behavior() {
        System.out.println("Executing second implementation");
    }
    
}
