/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

/**
 *
 * @author 1996mit
 */
public class ActionListener implements java.awt.event.ActionListener {

    OyunYonetim oy = new OyunYonetim();
    JToggleButton digerButton;

    @Override
    public void actionPerformed(ActionEvent ae) {
        JToggleButton tiklananDugme = (JToggleButton) ae.getSource();
        String name = tiklananDugme.getName();
        tiklananDugme.setText(name);

        if (oy.checker(Integer.parseInt(name))) {
            tiklananDugme.setEnabled(false);

        } else {
            tiklananDugme.setSelected(false);
            tiklananDugme.setText(" ");
            digerButton.setSelected(false);
            digerButton.setEnabled(true);
            digerButton.setText(" ");
        }
        this.digerButton = (JToggleButton) ae.getSource();

    }

}
