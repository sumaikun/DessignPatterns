/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator.objects;

/**
 *
 * @author jvega
 */
public class ChocolateCup extends Beverage{
    
    public ChocolateCup(String desc,int cost){
        
        //if doesn´t have sense if in description i write cofee so it must be a semantic object property validation
        //where a machine undestand an object as something no just like bytes, of course for that the system must
        //no only undestand the object also must understand what desc or description means.
        
        //I figured out two options, the first one create a word interface where class that identify the word description
        //as an object implemented it and then generate the enougth properties for check the sematic of a word depending
        //of the object that implemented.
        
        //The second option is generate a semantic logic for the word descriptión and the system matched it with 
        //a dataset that is save on a db an keep on a persistente memory.
        
        super(desc,cost);
    }
    
}
