package com.iabhitech.java.guiassignment;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Abhineet Verma
 */
public class Frame2 extends Frame implements ActionListener{
    private Button quit, incr, decr;
    private int counter = 0;
    
    public Frame2()
    {
        super();
        setTitle(String.valueOf(counter));
        setBounds(100,100, 600, 400);
        setBackground(new Color(0,10,40));
        setLayout(new FlowLayout());
        
        quit = new Button("Quit");
        quit.addActionListener(this);
        incr = new Button("Increment");
        incr.addActionListener(this);
        decr = new Button("Decrement");
        decr.addActionListener(this);
        
        add(quit);
        add(incr);
        add(decr);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == quit){
            System.exit(0);
        }
        else if(e.getSource() == incr){
            counter++;
            setTitle(String.valueOf(counter));
        }
        else {
            counter--;
            setTitle(String.valueOf(counter));
        }
    }
    
    
}
