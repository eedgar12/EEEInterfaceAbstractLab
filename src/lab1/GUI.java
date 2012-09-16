/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Toshiba laptop
 */
public final class GUI {
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
    
}
