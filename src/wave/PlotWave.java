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
public class PlotWave {
    private Plot graph;

    public PlotWave(Plot graph) {
        this.graph = graph;
    }

    public Plot sineWave(int startingPoint, int endPoint){
        int x = startingPoint;
        double y;
        
        this.graph.setPointSize(1);
        this.graph.setColor(Color.red);
        
        y = Math.cos(x);
        this.graph.addPoint(x, y);
        this.graph.setConnected(true);
        
        for( x=startingPoint+1; x<=endPoint; x++){
            //double y = Math.sin(x) + ((1/3) * Math.sin(3*x));
            y = Math.sin(x);
            this.graph.addPoint(x, y);
        }
        this.graph.setConnected(false);
        return null;
    }
    
        public Plot cosWave(int startingPoint, int endPoint){
        int x = startingPoint;
        double y;
        
        this.graph.setPointSize(1);
        this.graph.setColor(Color.blue);
        
        y = Math.cos(x);
        this.graph.addPoint(x, y);
        this.graph.setConnected(true);
        
        for( x=startingPoint+1; x<=endPoint; x++){
            //double y = Math.sin(x) + ((1/3) * Math.sin(3*x));
            y = Math.cos(x);
            this.graph.addPoint(x, y);
        }
        this.graph.setConnected(false);
        return null;
    }
        
    public Plot fourierShape(int startingPoint, int endPoint){
        int x = startingPoint;
        int k = 3;
        double y = Math.sin(1);
        this.graph.setConnected(true);
        this.graph.setPointSize(1);
        this.graph.setColor(Color.DARK_GRAY);
        
        
        
        for( x=startingPoint+1; x<=endPoint; x++){
            //double y = Math.sin(x) + ((1/3) * Math.sin(3*x));
            while(k<=150001){
            y += Math.sin(x*k)/k;
            k += 2;
            }
            this.graph.addPoint(x, y);
            k=1;
        }
        this.graph.setConnected(false);
        return null;
    }
    
}
