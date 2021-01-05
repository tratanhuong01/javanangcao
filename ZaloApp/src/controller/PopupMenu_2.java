package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class PopupMenu_2 {
    public JMenuItem load(JLabel lb) {
        JPopupMenu jPopupMenu = new JPopupMenu();
        JMenuItem mi2 = new JMenuItem("Thoát");
        mi2.setMnemonic(KeyEvent.VK_P);
        jPopupMenu.add(mi2);
        lb.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                showPopup(e);
            }
 
            @Override
            public void mouseReleased(MouseEvent e) {
                showPopup(e);
            }
 
            private void showPopup(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    jPopupMenu.show(e.getComponent(),
                            e.getX(), e.getY());
                }
            }
        });
        return mi2;
    }
}
