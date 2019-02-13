/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton.objects;

/**
 *
 * @author jvega
 */
public class ChocolateCompany {
    
    //The constructor must be private
    
    private  static ChocolateCompany chocolateCo;
    
    //if we declare the static method automatically this will prevent the lazy instantiation
    //private static ChocolateCompany chocolateCo = new ChocolateCompany();
    
    //another way is to instantiate proeprty like
    //private volatile static ChocolateCompany chocolateCo;
    
    private int produced_candies = 0;
    
    private int day_goal = 400;
    
    private ChocolateCompany(){
    
    }
    
    //public synchronized static ChocolateCompany get_instance(){
    //For synchronous lazy proccess
    //No snchronize the proccess can give the result of multiple threads
    
    public  static ChocolateCompany get_instance(){
        if(chocolateCo == null)
        {
            synchronized(ChocolateCompany.class){ //this is only for example, here its not neccesarry
                                                  //for synchronize chocolateCo must be volatile, 
                                                  //this synchronized only in object creation 
                chocolateCo = new ChocolateCompany();
            }
        }
        
        return chocolateCo;
    };
    
    
    public void add_candies(int candies_to_add)
    {
        if((produced_candies + candies_to_add)>day_goal)
        {
            System.out.println("No se pueden hacer mas que la meta del día");
        }
        else
        {
            this.produced_candies += candies_to_add;
            System.out.println("Cantidad Actual "+this.produced_candies);
        }
    }
    
    
    
}
