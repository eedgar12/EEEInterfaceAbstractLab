package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse{
//    String courseName;
//    private String courseNumber;
//    private double credits;
//    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber,
            String prerequisites, double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setPrerequisites(prerequisites);
        this.setCredits(credits);
    }

    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }



    
}
