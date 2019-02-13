/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command.objects;

/**
 *
 * @author jvega
 */
public class CeilingFan {
    
    private int speed;
    
    public int getSpeed(){
        return this.speed;
    }
    
    public void Off(){
        this.speed = 0;
        System.out.println("the ceiling fan is off");
    }
    
    public void Hight(){
        this.speed = 3;
        System.out.println("ceiling fan speed high");
    }
    
    public void Medium(){
        this.speed = 2;
        System.out.println("ceiling fan speed medium");
    }
    
    public void Low(){
        this.speed = 1;
        System.out.println("ceiling fan speed low");
    }
    
    public void SwitchTo(int toSpeed)
    {
        switch(toSpeed)
        {
            case 3:
                this.Hight();
                break;
            case 2:
                this.Medium();
                break;
            case 1:
                this.Low();
                break;
            case 0:
                this.Off();
                break;    
            default:
                this.Off();
                break;        
        }
    }
    
}
