/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator.decorators;
import Decorator.objects.Beverage;
/**
 *
 * @author jvega
 */
public class Cream extends BeverageDecorators{
    
    public Cream(String desc, int cost, Beverage b)
    {
        super(desc,cost,b);
    } 
}
