/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.awt.Button;
import javax.swing.JLabel;
import Domain.auto;
import java.util.logging.Level;
import java.util.logging.Logger;
import otrointento.frmauto;
import otrointento.frmauto;

/**
 *
 * @author Rita
 */
public class CarreraR1 extends Thread {

    private JLabel eti;
    private JLabel ate;
    private frmauto p;
    private frmauto s;
    private auto auto;
    public int paintTime;
    public int time = 200000;
    boolean suspender;
    boolean pausar;

    public CarreraR1(JLabel eti, frmauto p, int paintTime) {
        this.eti = eti;
        this.p = p;
        this.paintTime = paintTime;
        suspender = false;
        pausar = false;

    }

    public void run() {
        int c1 = 0, c2 = 0;
        boolean t = true, l = true, s = true, r = true, f = true;
        int a = 0, m = 0, n = 0, o = 0, q = 0;

        while (f == true) {
            try {
                //  try {
                sleep((paintTime));

                c1 = p.getLabel1().getLocation().x;
                c2 = p.getLabel2().getLocation().x;
                //if (c1 < p.getLabelLinea().getLocation().x  && c2 < p.getLabelLinea().getLocation().x ) {
                eti.setLocation(eti.getLocation().x - 10, eti.getLocation().y);
                if (q < 80) {

                    p.repaint();
                    q += 5;

                }
                if (q == 80) {
                    f = false;
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
                eti.setLocation(eti.getLocation().x, eti.getLocation().y - 10);
                if (o < 135) {

                    p.repaint();
                    o += 5;

                }
                if (o == 135) {
                    r = false;
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
                eti.setLocation(eti.getLocation().x + 10, eti.getLocation().y);
                if (n < 305) {

                    p.repaint();
                    n += 5;

                }
                if (n == 305) {
                    s = false;
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
                eti.setLocation(eti.getLocation().x , eti.getLocation().y+10);
                if (m < 135) {

                    p.repaint();
                    m += 5;

                }
                if (m == 135) {
                    l = false;
                }

                //} else {
            } catch (InterruptedException ex) {
                Logger.getLogger(Carrera.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        while (t == true) {
            try {
                //  try {
                sleep((paintTime));

                c1 = p.getLabel1().getLocation().x;
                c2 = p.getLabel2().getLocation().x;
                //if (c1 < p.getLabelLinea().getLocation().x  && c2 < p.getLabelLinea().getLocation().x ) {
                eti.setLocation(eti.getLocation().x-10, eti.getLocation().y);
                if (a < 225) {

                    p.repaint();
                    a += 5;

                }
                if (a == 225) {
                    t = false;
                }

                //} else {
            } catch (InterruptedException ex) {
                Logger.getLogger(CarreraR1.class.getName()).log(Level.SEVERE, null, ex);
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
                    Logger.getLogger(CarreraR1.class.getName()).log(Level.SEVERE, null, ex);
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
