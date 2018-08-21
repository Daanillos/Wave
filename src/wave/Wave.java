/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wave;

import java.awt.Color;

/**
 *
 * @author daani
 */
public class Wave {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Plot graph = new Plot("Sin x", -500,500,100,-5,5,1);
        
        
        PlotWave onda = new PlotWave(graph);
        
        onda.fourierShape(-500, 500);
        onda.sineWave(-500, 500);
        onda.cosWave(-50, 50);
        
    }
    
}
