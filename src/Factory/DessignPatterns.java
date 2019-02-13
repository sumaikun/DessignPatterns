/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;
import Factory.objects.*;
/**
 *
 * @author jvega
 */
//The abstract factory depends form composition and the normal factory from inheritance
//The nested classes allows me to organize the code in a way that is easy to read and create new software componentes
//Is ideal to use when you find a family of objects that share elements and methods in common but its implementations
//for some process are different, remember identify what vary, in that cases the factory keeps the abstraction in
//a low level and the concrete implementations on the software are in a 'over level' where we defined the rules.

//The concrete applications inside the factory can be reduce if we use Decorator for make object compositions
//For example wrapping the pizzas with the ingredients.


public class DessignPatterns {
    public static void main(String args[])
    {
        PizzaFactory pizzafactoryNy = new PizzaFactory.NyPizzaFactory();
        PizzaFactory pizzafactoryCa = new PizzaFactory.CaPizzaFactory();
        
        pizzafactoryNy.OrderPizza("NyPizzawithPeperoni");
        
        System.out.println("--------------------------");
        
        pizzafactoryCa.OrderPizza("CaPizzawithChesse");
    }
}
