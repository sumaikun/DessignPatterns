/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory.interfaces;

/**
 *
 * @author jvega
 */
public interface IngredientFactory {
    
     public Dough getDough();
     public Sausage getSausage();
     public Chesse getChesse();
     
     
     abstract class Dough{        
         public abstract void ingredientDescription();
     }
     
     abstract class Sausage{        
         public abstract void ingredientDescription();     
     }
     
     abstract class Chesse{        
         public abstract void ingredientDescription();     
     }
     
     class ThinDough extends Dough{

        @Override
        public void ingredientDescription() {
            System.out.println("This is a Thin Dough");
        }
    
    }
     
     class ThickDough extends Dough{

        @Override
        public void ingredientDescription() {
            System.out.println("This is a Thick Dough");
        }
     
     }
     
     class TomatoSausage extends Sausage{

        @Override
        public void ingredientDescription() {
            System.out.println("This is a Tomato Sausage");
        }
     
     }
     
     class MarinaSausage extends Sausage{

        @Override
        public void ingredientDescription() {
            System.out.println("This is a Marina Sausage");
        }
     
     }
     
     class MozarellaChesse extends Chesse{

        @Override
        public void ingredientDescription() {
            System.out.println("This is Mozarella Chesse");
        }
     
     }
     
     class AmericanChesse extends Chesse{

        @Override
        public void ingredientDescription() {
            System.out.println("This is American Chesse");
        }
     
     }
     
}
