/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator.objects;

/**
 *
 * @author jvega
 */
public abstract class Beverage {
    
    protected String description;
    protected int cost;    
    
    
    public Beverage(String description,int cost){
        this.description = description;
        this.cost = cost;
    }
   
    public String getDescription(){
        return this.description;
    }
    
    public int getCost(){
        return this.cost;
    }
    
    
   
    
   
}
