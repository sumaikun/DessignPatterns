/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory.interfaces;

/**
 *
 * @author jvega
 */
public class NyFactory implements IngredientFactory{

    @Override
    public Dough getDough() {
        return new IngredientFactory.ThickDough();
    }

    @Override
    public Sausage getSausage() {
        return new IngredientFactory.TomatoSausage();
    }

    @Override
    public Chesse getChesse() {
        return new IngredientFactory.MozarellaChesse();
    }
    
}
