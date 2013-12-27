/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KotkovetsCom;

/**
 *
 * @author admin
 */
public class LightOffCommand implements Command{
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }
    
    public void execute() {
        light.off();
    }
}
