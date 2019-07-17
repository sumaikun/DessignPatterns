/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade.objects;

/**
 *
 * @author jvega
 */

//This patterns doesn´t abstract only hide direct implementations of proccess that together generate a 
// 'Macro Proccess' with this is easily to organize the methods by composition and is easy to 
// mantain the code
public class WatchMovie {
    
    Food  food = new Food();
    Stereo  stereo = new Stereo();
    Tv  tv = new Tv();
    
    public void StartMovie()
    {
        food.getObject().TurnOn();
        stereo.getObject().TurnOn();
        tv.getObject().TurnOn();
    }
    
    public void EndMovie()
    {
        food.getObject().TurnOff();
        stereo.getObject().TurnOff();
        tv.getObject().TurnOff();
    }
}
