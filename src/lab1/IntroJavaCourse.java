package lab1;



/**
 * Describe responsibilities here.
 *
 * @author      Emma Edgar
 * @version     1.00
 */
public class IntroJavaCourse extends ProgrammingCourse{
//    String courseName;
//    private String courseNumber;
//    private double credits;
//    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber,
            String prerequisites, double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setPrerequisites(prerequisites);
        this.setCredits(credits);
    }


}
