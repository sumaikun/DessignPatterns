/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Facade.objects.*;
/**
 *
 * @author jvega
 */
public class DessignPatterns {
    public static void main(String[] args)
    {
        WatchMovie watchmovie = new WatchMovie();
        watchmovie.StartMovie();
        //When i finish of watch movie
        watchmovie.EndMovie();
    }
}
