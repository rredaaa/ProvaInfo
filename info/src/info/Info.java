/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package info;

import model.Prova;
import view.MyFrame;


/**
 *
 * @author rredaaa
 */
public class Info {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Prova p = new Prova("Reda", "Essalhi");
        System.out.println(p.getName());
        System.out.println(p.getSurname());
        
        MyFrame myWin= new MyFrame(p);
        myWin.setVisible(true);
    }
    
}
