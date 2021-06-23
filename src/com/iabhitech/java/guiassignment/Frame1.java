package com.iabhitech.java.guiassignment;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Abhineet Verma
 */
public class Frame1 extends Frame implements ActionListener{
    private Button quit, clickMe;
    private int counter = 0;
    
    public Frame1()
    {
        super();
        setTitle(String.valueOf(counter));
        setBounds(100,100, 600, 400);
        setBackground(new Color(0,10,40));
        setLayout(new FlowLayout());
        
        quit = new Button("Quit");
        quit.addActionListener(this);
        clickMe = new Button("Click Me");
        clickMe.addActionListener(this);
        
        add(quit);
        add(clickMe);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == quit){
            System.exit(0);
        }
        else {
            counter++;
            setTitle(String.valueOf(counter));
        }
    }
    
    
}
