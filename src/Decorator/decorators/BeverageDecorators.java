/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator.decorators;
import Decorator.objects.*;
/**
 *
 * @author jvega
 */

//This is the class that works like the parent of the decorators in this class must be the implementations
//o the wrapped features, not necessary in a concrete way.

public class BeverageDecorators  extends Beverage{
    
    Beverage beverage;
    
    
    BeverageDecorators(String desc,int cost,Beverage beverage){
        super(desc,cost);
        this.beverage = beverage;
    }
    
    //For a better design
    //wrap the cost and wrap the description could be an interface that is implemented by an object that have a behavior, that behavior should
    //import an object of any type and then identify wich property of the object must be wrapped or mixed with future
    //objects.
    
    @Override
    public int getCost(){
        return beverage.getCost()+this.cost;
    }
    
    @Override
    public String getDescription()
    {
        return beverage.getDescription()+this.description;
    }
    
}
