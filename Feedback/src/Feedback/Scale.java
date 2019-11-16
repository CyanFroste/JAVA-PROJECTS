/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feedback;

/**
 *
 * @author cyan
 */
public class Scale {  
    
    public int returnPoints(String value){
        if(value.equals("Poor"))
            return 1;
        if(value.equals("Uncertain"))
            return 2;
        if(value.equals("Fair"))
            return 3;
        if(value.equals("Good"))
            return 4;
        if(value.equals("Excellent"))
            return 5;
        return 0;
    }
    
}
