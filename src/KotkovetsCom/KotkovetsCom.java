/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KotkovetsCom;

/**
 *
 * @author admin
 */
public class KotkovetsCom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Comment: next commit");
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOffCommand lightOff = new LightOffCommand(light); 
        remote.setCommand(lightOff);
        remote.buttonWasPressed();
    }
}
