/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter.objects;
import Adapter.interfaces.*;
/**
 *
 * @author jvega
 */
public class Aduck implements Duck{

    @Override
    public void Fly() {
        System.out.println("I am fliying very good");
    }

    @Override
    public void Swim() {
        System.out.println("I swim very good");
    }

    @Override
    public void Quack() {
        System.out.println("I Quack Very good");
    }
    
}
