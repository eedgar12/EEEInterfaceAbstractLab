/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Toshiba laptop
 */
public interface ProgrammingCourse {
    public abstract void setCourseName(String name);
    public abstract String getCourseName();
    
    public abstract void setCourseNumber(String number);
    public abstract String getCourseNumber();
    
    public abstract void setCredits(double credits);
    public abstract double getCredits();
    
    public abstract void setPrerequisites(String prerequisites);
    public abstract String getPrerequisites();
}
