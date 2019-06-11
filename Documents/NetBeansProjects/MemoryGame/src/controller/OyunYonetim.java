/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import view.GUI;

/**
 *
 * @author 1996mit
 */
public class OyunYonetim {
    GUI ae;

    int sayac = 0;
    static int dogru = 0;
    int onceki = 0;

    public void setAdet(int adet) {
        dogru = adet / 2;
    }

    public boolean checker(int value) {
        if (onceki == 0) {
            onceki = value;
            return true;
        } else if (onceki == value) {
            onceki = 0;
            sayac++;
            bitisCizgisi();
            return true;
        } else {
            onceki = 0;
            return false;
        }
    }
    
    public void bitisCizgisi(){
        if(sayac == dogru){
            JOptionPane.showMessageDialog(ae, "THE END.", "Mesaj", JOptionPane.WARNING_MESSAGE);
        }
    }
}