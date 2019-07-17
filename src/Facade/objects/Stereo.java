/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade.objects;

/**
 *
 * @author jvega
 */
public class Stereo {
    
   private String state; 
    
   public Stereo getObject()
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
