/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.donation.classes;

import java.awt.Color;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author star
 */
public class Utility {
    public static void executeApp(String appname)
    {
         try {
            Runtime obj=Runtime.getRuntime();
            //obj.exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
            obj.exec("rundll32 SHELL32.DLL,ShellExec_RunDLL "+appname);
        } catch (IOException ex) {
             JOptionPane.showMessageDialog(null, ex.toString());
        }

    }
    public static void setBorder(JFrame frame){
        frame.getRootPane().setBorder(BorderFactory.createEtchedBorder());
    }
     public static void setBorder(JDialog frame){
        frame.getRootPane().setBorder(BorderFactory.createEtchedBorder());
    }
     public static void setBg(JDialog frame,Color c){
        frame.getContentPane().setBackground(c);
    }
     public static void setBg(JFrame frame,Color c){
        frame.getContentPane().setBackground(c);
    }
}
