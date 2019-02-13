/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory.interfaces;

/**
 *
 * @author jvega
 */
public class CaFactory implements IngredientFactory{

    @Override
    public Dough getDough() {
        return new IngredientFactory.ThinDough();
    }

    @Override
    public Sausage getSausage() {
        return new IngredientFactory.MarinaSausage();
    }

    @Override
    public Chesse getChesse() {
        return new IngredientFactory.AmericanChesse();
    }
    
}
