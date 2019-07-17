/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter.objects;

import Adapter.interfaces.Turkey;

/**
 *
 * @author jvega
 */
public class Aturkey implements Turkey{

    @Override
    public void fly() {
        System.out.println("I cant fly so hight");
    }

    @Override
    public void goobling() {
        System.out.println("globobboblbobobl");
    }

    @Override
    public void swim() {
        System.out.println("I swim but i prefer the land");
    }
    
}
