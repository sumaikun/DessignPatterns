/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

import Adapter.interfaces.Duck;
import Adapter.interfaces.Turkey;
import Adapter.objects.*;
/**
 *
 * @author jvega
 */
public class DessignPatterns {
    
    public static void main(String[] args)
    {
        Duck MallarDuck = new Aduck();
        VerifyIsDuck(MallarDuck);
        
        Turkey WildTurkey = new Aturkey();
        VerifyIsDuck(WildTurkey);        
        
        //With the adapter i can safe transform the type of object
        TurkeyDuckAdapter TurkeyDisguised  = new TurkeyDuckAdapter(WildTurkey);
        VerifyIsDuck(TurkeyDisguised);
    }
    
    private static void VerifyIsDuck(Object data)
    {
        if(data instanceof Duck)
        {
            System.out.println("Yes i am a duck");
        }
        else{
            System.out.println("Nope i not a duck");
        }
    }
}
