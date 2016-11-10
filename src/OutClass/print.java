/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OutClass;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author loai
 */
public class print {

    public void spit() {

        System.out.println("start");
        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(1000); // made some changes here <----
            } catch (InterruptedException ex) {
                Logger.getLogger(print.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("");
        System.out.println("end");

    }

}
