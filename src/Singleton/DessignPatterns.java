/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;
import Singleton.objects.*;
/**
 *
 * @author jvega
 */
public class DessignPatterns {
    public static void main(String[] args){
        
        ChocolateCompany MychocolateCompany = ChocolateCompany.get_instance();
        
        //Different instances to the same explicit object
        
        ChocolateCompany MychocolateCompanyCopy = ChocolateCompany.get_instance();
        
        MychocolateCompany.add_candies(200);
        System.out.println("--------------------");
        MychocolateCompanyCopy.add_candies(200);
        System.out.println("--------------------");
        MychocolateCompany.add_candies(200);
        
    }
}
