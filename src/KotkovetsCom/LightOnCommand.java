/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KotkovetsCom;

/**
 *
 * @author admin
 */
public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }
    
    public void execute() {
        light.on();
    }
}
