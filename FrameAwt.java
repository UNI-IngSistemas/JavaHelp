/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AwtFrame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Axel Garcia
 */
public class FrameAwt extends Frame{
    
    private static final long serialVersionUID = 1L;

    public FrameAwt(String titulo) throws HeadlessException {
        setTitle(titulo);
        setSize(400,400);
        setLocation(3, 3);
        setLocationRelativeTo(null);
        setVisible(true);
        setBackground(Color.yellow);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        
        });
    }
    public static void main(String[] args) {
        new FrameAwt("MI Primera Ventana xd");
        
    }
    
}
