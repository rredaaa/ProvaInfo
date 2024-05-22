/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import model.Prova;

/**
 *
 * @author Utente
 */
public class MyFrame extends JFrame{
    private Prova p;
    public MyFrame(Prova p) {
        
        
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.add(new JLabel(p.getName()));
        this.add(new JLabel(p.getSurname()));
    }
    
    
    
}
