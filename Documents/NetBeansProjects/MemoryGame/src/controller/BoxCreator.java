/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

/**
 *
 * @author 1996mit
 */
public class BoxCreator {

    OyunYonetim oy = new OyunYonetim();
    ActionListener od = new ActionListener();

    public BoxCreator(JPanel panel, String layout, int adet) {

        panel.removeAll();
        panel.repaint();

        if (adet % 2 == 1) {
            adet++;
        }
        oy.setAdet(adet);

        int rastgele[] = karistirici(adet);

        JToggleButton kutular[] = new JToggleButton[adet];

        for (int i = 0; i < kutular.length; ++i) {

            kutular[i] = new JToggleButton();
            panel.add(kutular[i]);
            kutular[i].addActionListener(od);
            kutular[i].setText(Integer.toString(rastgele[i]));
            kutular[i].setName(Integer.toString(rastgele[i]));
        }

        if ("Grid Layout".equals(layout)) {
            panel.setLayout(new GridLayout(4, 4));
        } else {
            panel.setLayout(new FlowLayout());
        }
        icerikGizle(adet, kutular);
    }

    public void icerikGizle(int adet, JToggleButton[] buttons) {
        for (int i = 0; i < adet; ++i) {
            buttons[i].setText(" ");
        }
    }

    public int[] karistirici(int adet) {
        int karisik[] = new int[adet];
        Random rand = new Random();

        for (int i = 0; i < adet; i++) {
            int n = 1 + rand.nextInt(adet / 2);
            if (sayac(karisik, n) < 2) {
                karisik[i] = n;
            } else {
                i--;
            }
        }
        return karisik;
    }

    public int sayac(int[] array, int deger) {
        int count = 0;
        for (int element : array) {
            if (element == deger) {
                count++;
            }
        }
        return count;
    }
}
