package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class AdvancedJavaCourse extends SoftwareProgrammingCourse {

    private double credits;
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber,double credits) {
        super(courseName, courseNumber,credits);
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            
            throw new IllegalArgumentException("Error: prerequisites cannot be null of empty string");
            
        }
        this.prerequisites = prerequisites;
    }

    public void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }

    @Override
    public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException("Error: courseNumber cannot be null of empty string");
        }
        super.setCourseNumber(courseNumber);
    }

}
