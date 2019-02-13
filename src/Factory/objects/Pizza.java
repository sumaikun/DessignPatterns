/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory.objects;


import Factory.interfaces.*;
/**
 *
 * @author jvega
 */
public abstract class Pizza {
    
    Pizza(){
        setDescription();
    }
    
    protected String description;
    
    protected IngredientFactory ingredientFacotory;
    
    public abstract void setDescription();
    
    public void getDescription(){
        System.out.println(description);
    }
    
    public  void prepare(){
        ingredientFacotory.getDough().ingredientDescription();
        ingredientFacotory.getSausage().ingredientDescription();
        ingredientFacotory.getChesse().ingredientDescription();
        System.out.println("the pizza is being prepared");
    };
    
    public void heat(){        
        System.out.println("the pizza is being heated");
    };
    
    public void deliver(){        
        System.out.println("the pizza es beign delivered");
    };
    
    static class NyPizzawithPeperoni extends Pizza{
        
        NyPizzawithPeperoni(){
            this.ingredientFacotory = new NyFactory();
        }
        
        
        @Override
        public void setDescription() {
            this.description = "I am a Ny pizza with peperoni";
        }
    
    }
    
    static class NyPizzawithChesse extends Pizza{
        
        NyPizzawithChesse(){
            this.ingredientFacotory = new NyFactory();
        }
        
        @Override
        public  void setDescription() {
            this.description = "I am a NY Pizza";
        }
    
    }
    
    static class CaPizzawithPeperoni extends Pizza{
        
        CaPizzawithPeperoni(){
            this.ingredientFacotory = new CaFactory();
        }
        
        @Override
        public void setDescription() {
            this.description = "the pizza Peperonni from california";
        }
    
    }
    
    static class CaPizzawithChesse extends Pizza{
        
        CaPizzawithChesse(){
            this.ingredientFacotory = new CaFactory();
        }
        
        @Override
        public void setDescription() {
            this.description = "the pizza chesse from california";
        }
    
    }
}
