/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade.objects;

/**
 *
 * @author jvega
 */
public class Tv {
    
   private String state; 
    
   public Tv getObject()
   {
       return this;
   }
   
   public void TurnOn(){
       this.state  = "On"; 
   }
   
   public void TurnOff(){
       this.state  = "Off";
   
   }
}
