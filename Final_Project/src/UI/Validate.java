/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

/**
 *
 * @author rjaco
 */
public class Validate {
    public boolean isEmptyOrNull(String input){
        return input.equals("") || input == null;
    }
    
    public boolean isNumeric(String input){
        try{
            double d = Double.parseDouble(input);
            
        } catch(Exception ex){
            return false;
        }
         return true; 
    }
}
