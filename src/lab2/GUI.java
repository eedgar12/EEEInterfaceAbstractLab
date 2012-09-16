/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
;
/**
 *
 * @author Toshiba laptop
 */
public class GUI {
    public final void displayName(String name){
        System.out.println("Course name: " + name);
    }
    
    public final void displayNumber(String num){
        System.out.println("Course nmber: " + num);
    }
    
    public final void displayPrerequisites(String prereqs){
        System.out.println("Prerequisite(s): " + prereqs);
                 
    }
    
    public final void displayCredits(double credits){
        System.out.println("Credits: " + credits);
    }
    
    public final void displayNullError(String method){
        System.out.println("Error: " + method + " cannot be null of empty string");
    }
}
