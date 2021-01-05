package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class PopupMenu_1 {
    public JPopupMenu load(JButton btn) {
        JPopupMenu jPopupMenu = new JPopupMenu();
        JMenuItem mi1 = new JMenuItem("Chat Server");
        mi1.setMnemonic(KeyEvent.VK_P);
        JMenuItem mi2 = new JMenuItem("Chat Client-Client");
        mi2.setMnemonic(KeyEvent.VK_P);
        jPopupMenu.add(mi1);
        jPopupMenu.add(mi2);
        btn.addMouseListener(new MouseAdapter() {
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
        mi1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
            }
        });
        mi2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
            }
        });
        return jPopupMenu;
    }
}
