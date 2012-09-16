/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Toshiba laptop
 */
public abstract class ProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private double credits;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        //needs validation
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        //needs validation
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        //needs validation
        this.credits = credits;
    }
    
    
}
