/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Toshiba laptop
 */
public class Startup {
    public static void main(String[] args) {
        GUI gui = new GUI();
        
        IntroToProgrammingCourse intro = new IntroToProgrammingCourse("Intro to Programming", "54651");
        String name = intro.getCourseName();
        String num = intro.getCourseNumber();
        gui.displayName(name);
        gui.displayNumber(num);
        
        AdvancedJavaCourse advJava = new AdvancedJavaCourse("Advanced Java", "186521");
        name = advJava.getCourseName();
        num = advJava.getCourseNumber();
        gui.displayName(name);
        gui.displayNumber(num);
        
        IntroJavaCourse introJava = new IntroJavaCourse("Intro Java", "1821");
        name = introJava.getCourseName();
        num = introJava.getCourseNumber();
        gui.displayName(name);
        gui.displayNumber(num);
    }
}
