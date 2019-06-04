/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.awt.Button;
import javax.swing.JLabel;
import Domain.auto;
import java.awt.Label;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import otrointento.frmauto;


/**
 *
 * @author Rita
 */
public class Carrera extends Thread {

    private JLabel eti;
    private JLabel ate;
    private frmauto p;
    private frmauto s;
    private auto auto;
    public int paintTime;
    public int time = 200000;
    boolean suspender;
    boolean pausar;
    

    public Carrera(JLabel eti, frmauto p, int paintTime) {
        this.eti = eti;
        this.p = p;
        this.paintTime = paintTime;
        suspender = false;
        pausar = false;

    }

    public Carrera(Label label, frmauto aThis, int time) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void run() {
        int c1 = 0, c2 = 0;
        boolean t = true, l = true, s=true, r=true, f=true;
        int a = 0, m = 0, n=0, o=0, q=0;
        frmauto g= new frmauto();
        
        while (t == true) {
            try {
                //  try {
                sleep((paintTime));
                

                c1 = p.getLabel1().getLocation().x;
                c2 = p.getLabel2().getLocation().x;
                //if (c1 < p.getLabelLinea().getLocation().x  && c2 < p.getLabelLinea().getLocation().x ) {
                eti.setLocation(eti.getLocation().x + 10, eti.getLocation().y);
                if (a < 250) {
                    p.repaint();
                    a += 5;

                }
                if (a == 250) {
                    t = false;
                }

                //} else {
            } catch (InterruptedException ex) {
                Logger.getLogger(Carrera.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        while (l == true) {
            try {
                //  try {
                sleep((paintTime));

                c1 = p.getLabel1().getLocation().x;
                c2 = p.getLabel2().getLocation().x;
                //if (c1 < p.getLabelLinea().getLocation().x  && c2 < p.getLabelLinea().getLocation().x ) {
                eti.setLocation(eti.getLocation().x, eti.getLocation().y - 10);
                if (m < 175) {

                    p.repaint();
                    m += 5;

                }
                if (m == 175) {
                    l = false;
                }

                //} else {
            } catch (InterruptedException ex) {
                Logger.getLogger(Carrera.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        while (s == true) {
            try {
                //  try {
                sleep((paintTime));

                c1 = p.getLabel1().getLocation().x;
                c2 = p.getLabel2().getLocation().x;
                //if (c1 < p.getLabelLinea().getLocation().x  && c2 < p.getLabelLinea().getLocation().x ) {
                eti.setLocation(eti.getLocation().x - 10, eti.getLocation().y);
                if (n < 360) {

                    p.repaint();
                    n += 5;

                }
                if (n == 360) {
                    s = false;
                }

                //} else {
            } catch (InterruptedException ex) {
                Logger.getLogger(Carrera.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
        while (r == true) {
            try {
                //  try {
                sleep((paintTime));

                c1 = p.getLabel1().getLocation().x;
                c2 = p.getLabel2().getLocation().x;
                //if (c1 < p.getLabelLinea().getLocation().x  && c2 < p.getLabelLinea().getLocation().x ) {
                eti.setLocation(eti.getLocation().x, eti.getLocation().y + 10);
                if (o < 175) {

                    p.repaint();
                    o += 5;

                }
                if (o == 175) {
                    r = false;
                }

                //} else {
            } catch (InterruptedException ex) {
                Logger.getLogger(Carrera.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
         while (f == true) {
            try {
                //  try {
                sleep((paintTime));

                c1 = p.getLabel1().getLocation().x;
                c2 = p.getLabel2().getLocation().x;
                //if (c1 < p.getLabelLinea().getLocation().x  && c2 < p.getLabelLinea().getLocation().x ) {
                eti.setLocation(eti.getLocation().x + 10, eti.getLocation().y);
               
                if (q < 110) {

                    p.repaint();
                    q += 5;

                }
                if (q == 110) {
                    f = false;
                }

                //} else {
            } catch (InterruptedException ex) {
                Logger.getLogger(Carrera.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
    // } catch (InterruptedException e) {
    //}

    public void run2() {
        synchronized (this) {
            while (suspender) {
                try {
                    wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Carrera.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (pausar) {

            }
        }
    }

    public synchronized void ReaunudarHilo() {
        suspender = false;
        notify();

    }

    public synchronized void suspender() {
        suspender = true;
        notify();
    }

    public synchronized void pausar() {
        pausar = true;
        suspender = false;
        notify();
    }

//     public Thread IngresarCantidadHilos(int cantidad){
//        for (int i = 0; i < cantidad; i++) {
//                    
//            //hacer los hilos
//            if (checkBox.isSelected()){
//                //HILOS CON IMAGENES
//            }else{
//                //hilos sin imagenes
//                    
//            
//            
//        }
//        
//        
//    }
//    
//      return Thread.currentThread();      
//  }
}
