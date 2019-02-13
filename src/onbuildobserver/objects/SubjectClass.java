/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package onbuildobserver.objects;
import java.util.Observable;
//import java.util.Observer;
/**
 *
 * @author jvega
 */
public class SubjectClass  extends Observable {
    
       public void notify_to_observers()
       {
           //set changed is protected i cant use on main.
           setChanged();
           notifyObservers();
       }
       
       public void notify_to_observers2()
       {
           //set changed is protected i cant use on main.
           String parameters = "something";
           setChanged();
           notifyObservers(parameters);
       }
    
}
