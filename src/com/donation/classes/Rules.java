/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.donation.classes;
import java.awt.*;
import javax.swing.JTextField;
import com.toedter.calendar.JTextFieldDateEditor;

/**
 *
 * @author star
 */
public class Rules {
    
    public static void isValid(JTextField b1,boolean b2){
        if(b2 == true){
            b1.setForeground(Color.blue);
        }else{
            b1.setForeground(Color.red);
        }
    }
    public static boolean isInteger(String s){
        try{
            int a = Integer.parseInt(s);
            return true;
        }catch(Exception e){
            return false;
        }
        
    }
    public static boolean isChar(String s){
        if(s.matches("^[a-zA-Z ]*$")){
            return true;
        }else{
            return false;
        }
        
    }
    public static boolean isDouble(String s){
        if(s.matches("^\\d+(\\.\\d{2})?$")){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isEmail(String s){
        if(s.matches("^\\w+@\\w+\\.\\w{2,3}(\\.\\w{2,3})?$")){
            return true;
        }else{
            return false;
        }
        
    }
    public static boolean isMobile(String s){
        if(s.matches("^\\d{10}$")){
            return true;
        }else{
            return false;
        }
        
    }
     public static boolean isAddress(String s){
        if(s.matches("^[#.0-9a-zA-Z\\s,-]+$")){
            return true;
        }else{
            return false;
        }
        
    }
    public static boolean isPass(String s){
        String regex = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{8,20}$";

        if(s.matches(regex)){
            return true;
        }else{
            return false;
        }
        
    }
}
