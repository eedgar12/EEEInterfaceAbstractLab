/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Toshiba laptop
 */
public class Startup {
    
        public static void main(String[] args) {
            
            ProgrammingCourse[] courses = {
                new IntroToProgrammingCourse("Intro to Programming", "51245", 
                    "No prerequisites", 3),
                new IntroJavaCourse("Intro to Java", "25832", "Intro to Programming"
                    , 4),
                new AdvancedJavaCourse("Adv Java", "7546", "Intro to Programming, "
                    + "Intro to Java", 4)
            };
        
            GUI gui = new GUI();    
            
            for(int i=0; i < courses.length; i++) {
                String name = courses[i].getCourseName();
                String num = courses[i].getCourseNumber();
                String prereq = courses[i].getPrerequisites();
                double credits = courses[i].getCredits();
                
                gui.displayName(name);
                gui.displayNumber(num);
                gui.displayPrerequisites(prereq);
                gui.displayCredits(credits);
            }
    }
    
    
}