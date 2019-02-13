/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory.objects;
import Factory.interfaces.*;

/**
 *
 * @author jvega
 */

//The idea is to group family of objects for keep it on a same interface por creation
//One of the problems is that is parametrizes in compile time so we could the favtory implementations
//more abstract for use a better version on run time.
public abstract class PizzaFactory {
    
    public void OrderPizza(String pizzaName){
        
       Pizza pizza =  CreatePizza(pizzaName);       
       pizza.prepare();
       pizza.getDescription();
       pizza.heat();
       pizza.deliver();
    }
    
    public abstract Pizza CreatePizza(String pizzaName);
    
    public static class NyPizzaFactory extends PizzaFactory{

        @Override
        public Pizza CreatePizza(String pizzaName) {  
            
           System.out.println("Creating "+pizzaName);
            
           if(pizzaName.equals("NyPizzawithPeperoni"))
           {
               return new Pizza.NyPizzawithPeperoni();
           }
           if(pizzaName.equals("NyPizzawithChesse"))
           {
               return new Pizza.NyPizzawithChesse();
           }
            
           return null; 
        }
    
    }
    
    public static class CaPizzaFactory extends PizzaFactory{

        @Override   
        public Pizza CreatePizza(String pizzaName) {
            
            System.out.println("Creating "+pizzaName);
           
            if(pizzaName.equals("CaPizzawithPeperoni"))
           {
               return new Pizza.CaPizzawithPeperoni();
           }
           if(pizzaName.equals("CaPizzawithChesse"))
           {
               return new Pizza.CaPizzawithChesse();
           }
            
           return null;
        }
    
    }
    
    
}
