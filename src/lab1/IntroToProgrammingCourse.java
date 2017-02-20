package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES! Do not
 * change this fact.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroToProgrammingCourse extends SoftwareProgrammingCourse {

    public IntroToProgrammingCourse(String courseName, String courseNumber,double credits) {
        super(courseName, courseNumber,credits);
    }

    @Override
    public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException("Error: courseNumber cannot be null of empty string");
        }
        super.setCourseNumber(courseNumber);
    }   

    @Override
    public void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            throw new IllegalArgumentException("Error: credits must be in the range 0.5 to 4.0");
        }
        super.setCredits(credits);
    }

    @Override
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {            
          throw new IllegalArgumentException("Error: courseName cannot be null of empty string");           
        }
        super.setCourseName(courseName); 
    }
    
    @Override
    public void setPrerequisites(String prerequisites) {       
    }

    @Override
    public String getPrerequisites() {
        return("None"); 
    }
}
