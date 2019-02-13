/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import Decorator.objects.*;
import Decorator.decorators.*;

/**
 *
 * @author jvega
 */
//With this pattern you can wrap the properties or the bahavior of any class and extended it

//The wrapped is made for two 'sibling classes' that are similar because share a parent class or an interface

public class DesignPatterns {
    
    public static void main(String[] args)
    {        
        Beverage cup1 = new Coffe("Coffe Cup",1000);
        
        Beverage cup2 = new ChocolateCup("Chocolate Cup",1500);
        
        System.out.println(cup1.getDescription()+" "+cup1.getCost());
        
        System.out.println(cup2.getDescription()+" "+cup2.getCost());        
        
        cup1 = new Cream(" with cream ",600,cup1);
        
        cup2 = new Milk(" with milk ",800,cup2);       
        
        System.out.println(cup1.getDescription()+" "+cup1.getCost());        
        
        System.out.println(cup2.getDescription()+" "+cup2.getCost());
        
        cup1 = new Cream(" and sugar ",0,cup1);
        
        System.out.println(cup1.getDescription()+" "+cup1.getCost());        
    }
    
}
