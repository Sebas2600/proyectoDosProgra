/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import Domain.Point;
import static java.lang.Thread.yield;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Rita
 */
public class auto {
   public String ID;
   public Point pointPosition;
   JLabel label;
   public int sizeX;
   public int sizeY;
   public int velocidad;

    public auto(String ID, Point pointPosition, int sizeX, int sizeY,JLabel label,int velocidad) {
        this.ID = ID;
        this.pointPosition = pointPosition;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.label=label;
        this.velocidad=velocidad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Point getPointPosition() {
        return pointPosition;
    }

    public void setPointPosition(Point pointPosition) {
        this.pointPosition = pointPosition;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public int getSizeX() {
        return sizeX;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    


   
  

    
    
    
}
